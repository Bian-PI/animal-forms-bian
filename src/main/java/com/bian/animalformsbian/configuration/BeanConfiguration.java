package com.bian.animalformsbian.configuration;

import com.bian.animalformsbian.adapter.driven.mongo.adapter.AnimalEvaluationMongoAdapter;
import com.bian.animalformsbian.adapter.driven.mongo.mapper.IAnimalDocumentMapper;
import com.bian.animalformsbian.adapter.driven.mongo.repository.IAnimalWelfareEvaluationMongoRepository;
import com.bian.animalformsbian.domain.api.IAnimalServicePort;
import com.bian.animalformsbian.domain.spi.IAnimalPersistencePort;
import com.bian.animalformsbian.domain.usecase.AnimalUseCase;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanConfiguration {
    private final IAnimalWelfareEvaluationMongoRepository animalWelfareEvaluationMongoRepository;
    private final IAnimalDocumentMapper animalDocumentMapper;

    public BeanConfiguration(IAnimalWelfareEvaluationMongoRepository animalWelfareEvaluationMongoRepository, IAnimalDocumentMapper animalDocumentMapper) {
        this.animalWelfareEvaluationMongoRepository = animalWelfareEvaluationMongoRepository;
        this.animalDocumentMapper = animalDocumentMapper;
    }

    @Bean
    public IAnimalServicePort animalServicePort() {
        return new AnimalUseCase(animalPersistencePort());
    }

    @Bean
    public IAnimalPersistencePort animalPersistencePort() {
        return new AnimalEvaluationMongoAdapter(animalWelfareEvaluationMongoRepository, animalDocumentMapper);
    }
}
