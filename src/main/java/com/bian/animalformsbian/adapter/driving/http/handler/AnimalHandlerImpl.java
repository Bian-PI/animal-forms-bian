package com.bian.animalformsbian.adapter.driving.http.handler;

import com.bian.animalformsbian.adapter.driving.http.dto.request.AnimalWelfareEvaluationRequestDto;
import com.bian.animalformsbian.adapter.driving.http.dto.response.AnimalWelfareEvaluationResponseDto;
import com.bian.animalformsbian.adapter.driving.http.mapper.IAnimalRequestMapper;
import com.bian.animalformsbian.adapter.driving.http.mapper.IAnimalResponseMapper;
import com.bian.animalformsbian.domain.api.IAnimalServicePort;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AnimalHandlerImpl implements IAnimalHandler {
    private final IAnimalServicePort animalServicePort;
    private final IAnimalRequestMapper animalRequestMapper;
    private final IAnimalResponseMapper animalResponseMapper;

    public AnimalHandlerImpl(IAnimalServicePort animalServicePort, IAnimalRequestMapper animalRequestMapper, IAnimalResponseMapper animalResponseMapper) {
        this.animalServicePort = animalServicePort;
        this.animalRequestMapper = animalRequestMapper;
        this.animalResponseMapper = animalResponseMapper;
    }

    @Override
    public void createReport(AnimalWelfareEvaluationRequestDto animalWelfareEvaluationRequestDto) {
        animalServicePort.createReport(animalRequestMapper.toAnimal(animalWelfareEvaluationRequestDto));
    }

    @Override
    public List<AnimalWelfareEvaluationResponseDto> getReports(String userId) {
        return animalResponseMapper.toResponseList(animalServicePort.getReports(userId));
    }

    @Override
    public List<AnimalWelfareEvaluationResponseDto> getReportsForAdmins(String userId) {
        return animalResponseMapper.toResponseList(animalServicePort.getReportsForAdmins(userId));
    }

    @Override
    public AnimalWelfareEvaluationResponseDto getReport(String id) {
        return animalResponseMapper.toResponse(animalServicePort.getReport(id));
    }
}
