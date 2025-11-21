package com.bian.animalformsbian.domain.usecase;

import com.bian.animalformsbian.domain.api.IAnimalServicePort;
import com.bian.animalformsbian.domain.model.AnimalWelfareEvaluation;
import com.bian.animalformsbian.domain.spi.IAnimalPersistencePort;

import java.util.List;

public class AnimalUseCase implements IAnimalServicePort {
    private final IAnimalPersistencePort animalPersistencePort;

    public AnimalUseCase(IAnimalPersistencePort animalPersistencePort) {
        this.animalPersistencePort = animalPersistencePort;
    }

    @Override
    public void createReport(AnimalWelfareEvaluation animalWelfareEvaluation) {
        animalPersistencePort.createReport(animalWelfareEvaluation);
    }

    @Override
    public List<AnimalWelfareEvaluation> getReports(String userId) {
        return animalPersistencePort.getReports(userId);
    }

    @Override
    public List<AnimalWelfareEvaluation> getReportsForAdmins(String userId) {
        return animalPersistencePort.getReportsForAdmins(userId);
    }

    @Override
    public AnimalWelfareEvaluation getReport(String id) {
        return animalPersistencePort.getReport(id);
    }
}
