package com.bian.animalformsbian.domain.api;

import com.bian.animalformsbian.domain.model.AnimalWelfareEvaluation;

import java.util.List;

public interface IAnimalServicePort {
    void createReport(AnimalWelfareEvaluation animalWelfareEvaluation);
    List<AnimalWelfareEvaluation> getReports(String userId);
    List<AnimalWelfareEvaluation> getReportsForAdmins(Long id);
    AnimalWelfareEvaluation getReport(String id);
}
