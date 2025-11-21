package com.bian.animalformsbian.adapter.driving.http.handler;

import com.bian.animalformsbian.adapter.driving.http.dto.request.AnimalWelfareEvaluationRequestDto;
import com.bian.animalformsbian.adapter.driving.http.dto.response.AnimalWelfareEvaluationResponseDto;

import java.util.List;

public interface IAnimalHandler {
    void createReport(AnimalWelfareEvaluationRequestDto animalWelfareEvaluationRequestDto);
    List<AnimalWelfareEvaluationResponseDto> getReports(String userId);
    List<AnimalWelfareEvaluationResponseDto> getReportsForAdmins(String userId);
    AnimalWelfareEvaluationResponseDto getReport(String id);
}
