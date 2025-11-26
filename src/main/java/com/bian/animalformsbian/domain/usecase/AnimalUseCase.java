package com.bian.animalformsbian.domain.usecase;

import com.bian.animalformsbian.domain.api.IAnimalServicePort;
import com.bian.animalformsbian.domain.api.IUserServicePort;
import com.bian.animalformsbian.domain.model.AnimalWelfareEvaluation;
import com.bian.animalformsbian.domain.spi.IAnimalPersistencePort;

import java.util.List;

import static com.bian.animalformsbian.domain.utils.DomainConstants.STATUS_OFFLINE;

public class AnimalUseCase implements IAnimalServicePort {
    private final IAnimalPersistencePort animalPersistencePort;
    private final IUserServicePort userServicePort;

    public AnimalUseCase(IAnimalPersistencePort animalPersistencePort, IUserServicePort userServicePort) {
        this.animalPersistencePort = animalPersistencePort;
        this.userServicePort = userServicePort;
    }

    @Override
    public void createReport(AnimalWelfareEvaluation animalWelfareEvaluation) {
        if (STATUS_OFFLINE.equals(animalWelfareEvaluation.getConnectionStatus())) {
            String realUserId = userServicePort.getUserIdByDocument(animalWelfareEvaluation.getUserId());

            if (realUserId != null) {
                animalWelfareEvaluation.setUserId(realUserId);
            }
        }

        animalPersistencePort.createReport(animalWelfareEvaluation);
    }

    @Override
    public List<AnimalWelfareEvaluation> getReports(String userId) {
        return animalPersistencePort.getReports(userId);
    }

    @Override
    public List<AnimalWelfareEvaluation> getReportsForAdmins(Long id) {
        if (userServicePort.isUserAdmin(id))
            return animalPersistencePort.getReportsForAdmins();

        return null;
    }

    @Override
    public AnimalWelfareEvaluation getReport(String id) {
        return animalPersistencePort.getReport(id);
    }
}