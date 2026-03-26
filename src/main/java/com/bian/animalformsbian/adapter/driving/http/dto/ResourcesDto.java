package com.bian.animalformsbian.adapter.driving.http.dto;

import java.util.Map;

public class ResourcesDto extends BaseSectionDto {

    public ResourcesDto() {
    }

    public ResourcesDto(String score, String weight, Map<String, String> responses) {
        super(score, weight, responses);
    }
}
