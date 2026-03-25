package com.bian.animalformsbian.adapter.driving.http.dto;

import java.util.Map;

public class ResourceDto extends BaseSectionDto {

    public ResourceDto() {
    }

    public ResourceDto(String score, String weight, Map<String, String> responses) {
        super(score, weight, responses);
    }
}
