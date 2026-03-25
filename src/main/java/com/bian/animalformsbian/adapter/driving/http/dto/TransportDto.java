package com.bian.animalformsbian.adapter.driving.http.dto;

import java.util.Map;

public class TransportDto extends BaseSectionDto {
    public TransportDto() {
    }

    public TransportDto(String score, String weight, Map<String, String> responses) {
        super(score, weight, responses);
    }
}
