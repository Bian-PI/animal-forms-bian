package com.bian.animalformsbian.adapter.driven.mongo.repository;

import com.bian.animalformsbian.adapter.driven.mongo.document.AnimalWelfareEvaluationDocument;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface IAnimalWelfareEvaluationMongoRepository extends MongoRepository<AnimalWelfareEvaluationDocument, String> {
    List<AnimalWelfareEvaluationDocument> findByUserId(String userId);
}
