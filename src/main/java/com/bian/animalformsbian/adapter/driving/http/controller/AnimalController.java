package com.bian.animalformsbian.adapter.driving.http.controller;

import com.bian.animalformsbian.adapter.driving.http.dto.request.AnimalWelfareEvaluationRequestDto;
import com.bian.animalformsbian.adapter.driving.http.dto.response.AnimalWelfareEvaluationResponseDto;
import com.bian.animalformsbian.adapter.driving.http.handler.IAnimalHandler;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Collections;
import java.util.List;
import java.util.Map;

import static com.bian.animalformsbian.configuration.Constants.REPORT_CREATED_MESSAGE;
import static com.bian.animalformsbian.configuration.Constants.RESPONSE_MESSAGE_KEY;

@RestController
@RequestMapping("/animals/evaluation")
public class AnimalController {
    private final IAnimalHandler animalHandler;

    public AnimalController(IAnimalHandler animalHandler) {
        this.animalHandler = animalHandler;
    }

    @PostMapping
    public ResponseEntity<Map<String, String>> createReport(@RequestBody AnimalWelfareEvaluationRequestDto requestDto) {
        animalHandler.createReport(requestDto);
        return ResponseEntity.status(HttpStatus.CREATED)
                .body(Collections.singletonMap(RESPONSE_MESSAGE_KEY, REPORT_CREATED_MESSAGE));
    }

    @GetMapping("/{id}")
    public ResponseEntity<AnimalWelfareEvaluationResponseDto> getReport(@PathVariable("id") String id) {
        return new ResponseEntity<>(animalHandler.getReport(id), HttpStatus.OK);
    }

    @GetMapping("/all/{id}")
    public ResponseEntity<List<AnimalWelfareEvaluationResponseDto>> getReports(@PathVariable("id") String id) {
        return new ResponseEntity<>(animalHandler.getReports(id), HttpStatus.OK);
    }

    @GetMapping("/users/{id}")
    public ResponseEntity<List<AnimalWelfareEvaluationResponseDto>> getReportsForAdmins(@PathVariable("id") Long id) {
        return new ResponseEntity<>(animalHandler.getReportsForAdmins(id), HttpStatus.OK);
    }
}
