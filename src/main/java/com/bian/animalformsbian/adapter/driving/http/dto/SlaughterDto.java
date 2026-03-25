package com.bian.animalformsbian.adapter.driving.http.dto;

import java.util.Map;

public class SlaughterDto extends BaseSectionDto {
    public SlaughterDto() {
    }

    public SlaughterDto(String score, String weight, Map<String, String> responses) {
        super(score, weight, responses);
    }
}
