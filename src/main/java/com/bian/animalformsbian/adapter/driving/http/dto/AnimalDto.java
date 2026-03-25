package com.bian.animalformsbian.adapter.driving.http.dto;

import java.util.Map;

public class AnimalDto extends BaseSectionDto {
    public AnimalDto() {
    }

    public AnimalDto(String score, String weight, Map<String, String> responses) {
        super(score, weight, responses);
    }
}
