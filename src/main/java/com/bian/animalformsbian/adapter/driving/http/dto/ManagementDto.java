package com.bian.animalformsbian.adapter.driving.http.dto;

import java.util.Map;

public class ManagementDto extends BaseSectionDto {
    public ManagementDto() {
    }

    public ManagementDto(String score, String weight, Map<String, String> responses) {
        super(score, weight, responses);
    }
}
