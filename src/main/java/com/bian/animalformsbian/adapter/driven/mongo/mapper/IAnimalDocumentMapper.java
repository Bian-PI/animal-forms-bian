package com.bian.animalformsbian.adapter.driven.mongo.mapper;

import com.bian.animalformsbian.adapter.driven.mongo.document.AnimalWelfareEvaluationDocument;
import com.bian.animalformsbian.domain.model.AnimalWelfareEvaluation;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

import java.util.List;

@Mapper(componentModel = "spring",
        unmappedTargetPolicy = ReportingPolicy.IGNORE,
        unmappedSourcePolicy = ReportingPolicy.IGNORE)
public interface IAnimalDocumentMapper {
    AnimalWelfareEvaluationDocument toDocument(AnimalWelfareEvaluation animalWelfareEvaluation);
    AnimalWelfareEvaluation toAnimalEvaluation(AnimalWelfareEvaluationDocument animalWelfareEvaluationDocument);
    List<AnimalWelfareEvaluation> toAnimalEvaluationList(List<AnimalWelfareEvaluationDocument> animalWelfareEvaluationDocumentList);
}
