package com.bian.animalformsbian.adapter.driven.mongo.adapter;

import com.bian.animalformsbian.adapter.driven.mongo.document.AnimalWelfareEvaluationDocument;
import com.bian.animalformsbian.adapter.driven.mongo.exception.NoDataFoundException;
import com.bian.animalformsbian.adapter.driven.mongo.mapper.IAnimalDocumentMapper;
import com.bian.animalformsbian.adapter.driven.mongo.repository.IAnimalWelfareEvaluationMongoRepository;
import com.bian.animalformsbian.domain.model.AnimalWelfareEvaluation;
import com.bian.animalformsbian.domain.spi.IAnimalPersistencePort;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional
public class AnimalEvaluationMongoAdapter implements IAnimalPersistencePort {
    private final IAnimalWelfareEvaluationMongoRepository repository;
    private final IAnimalDocumentMapper animalDocumentMapper;

    public AnimalEvaluationMongoAdapter(IAnimalWelfareEvaluationMongoRepository repository, IAnimalDocumentMapper animalDocumentMapper) {
        this.repository = repository;
        this.animalDocumentMapper = animalDocumentMapper;
    }

    @Override
    public void createReport(AnimalWelfareEvaluation animalWelfareEvaluation) {
        repository.save(animalDocumentMapper.toDocument(animalWelfareEvaluation));
    }

    @Override
    public List<AnimalWelfareEvaluation> getReports(String userId) {
        List<AnimalWelfareEvaluationDocument> evaluationDocuments = repository.findByUserId(userId);
        if (evaluationDocuments.isEmpty()) throw new NoDataFoundException();

        return animalDocumentMapper.toAnimalEvaluationList(evaluationDocuments);
    }

    @Override
    public List<AnimalWelfareEvaluation> getReportsForAdmins() {
        List<AnimalWelfareEvaluationDocument> evaluationDocuments = repository.findAll();
        if (evaluationDocuments.isEmpty()) throw new NoDataFoundException();

        return animalDocumentMapper.toAnimalEvaluationList(evaluationDocuments);
    }

    @Override
    public AnimalWelfareEvaluation getReport(String id) {
        return animalDocumentMapper.toAnimalEvaluation(repository.findById(id).orElseThrow(NoDataFoundException::new));
    }
}
