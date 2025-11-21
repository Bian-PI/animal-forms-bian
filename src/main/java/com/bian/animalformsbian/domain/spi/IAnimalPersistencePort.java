package com.bian.animalformsbian.domain.spi;

import com.bian.animalformsbian.domain.model.AnimalWelfareEvaluation;

import java.util.List;

public interface IAnimalPersistencePort {
    void createReport(AnimalWelfareEvaluation animalWelfareEvaluation);
    List<AnimalWelfareEvaluation> getReports(String userId);
    List<AnimalWelfareEvaluation> getReportsForAdmins(String userId);
    AnimalWelfareEvaluation getReport(String id);
}
