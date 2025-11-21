package com.bian.animalformsbian.adapter.driving.http.dto;

import java.util.Map;

public abstract class BaseSectionDto {
    private String score;
    private Map<String, String> responses;

    public BaseSectionDto() {}

    public BaseSectionDto(String score, Map<String, String> responses) {
        this.score = score;
        this.responses = responses;
    }

    public String getScore() {
        return score;
    }

    public void setScore(String score) {
        this.score = score;
    }

    public Map<String, String> getResponses() {
        return responses;
    }

    public void setResponses(Map<String, String> responses) {
        this.responses = responses;
    }
}
