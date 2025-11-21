package com.bian.animalformsbian.adapter.driving.http.mapper;

import com.bian.animalformsbian.adapter.driving.http.dto.response.AnimalWelfareEvaluationResponseDto;
import com.bian.animalformsbian.domain.model.AnimalWelfareEvaluation;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

import java.util.List;

@Mapper(componentModel = "spring",
        unmappedTargetPolicy = ReportingPolicy.IGNORE,
        unmappedSourcePolicy = ReportingPolicy.IGNORE)
public interface IAnimalResponseMapper {
    AnimalWelfareEvaluationResponseDto toResponse(AnimalWelfareEvaluation animalWelfareEvaluation);
    List<AnimalWelfareEvaluationResponseDto> toResponseList(List<AnimalWelfareEvaluation> animalWelfareEvaluationList);
}
