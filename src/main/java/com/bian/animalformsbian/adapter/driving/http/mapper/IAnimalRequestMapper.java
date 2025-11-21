package com.bian.animalformsbian.adapter.driving.http.mapper;

import com.bian.animalformsbian.adapter.driving.http.dto.request.AnimalWelfareEvaluationRequestDto;
import com.bian.animalformsbian.adapter.driving.http.dto.response.AnimalWelfareEvaluationResponseDto;
import com.bian.animalformsbian.domain.model.AnimalWelfareEvaluation;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

@Mapper(componentModel = "spring",
        unmappedTargetPolicy = ReportingPolicy.IGNORE,
        unmappedSourcePolicy = ReportingPolicy.IGNORE)
public interface IAnimalRequestMapper {
    AnimalWelfareEvaluation toAnimal(AnimalWelfareEvaluationRequestDto animalWelfareEvaluationRequestDto);
    AnimalWelfareEvaluationResponseDto toAnmimalResponseDto(AnimalWelfareEvaluationRequestDto animalWelfareEvaluationRequestDto);
}
