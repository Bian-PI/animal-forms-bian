package com.bian.animalformsbian.domain.model;

import java.util.Map;

public abstract class BaseSection {
    private String score;
    private String weight;
    private Map<String, String> responses;

    public BaseSection() {}

    public BaseSection(String score, String weight, Map<String, String> responses) {
        this.score = score;
        this.weight = weight;
        this.responses = responses;
    }

    public String getScore() {
        return score;
    }

    public void setScore(String score) {
        this.score = score;
    }

    public String getWeight() {
        return weight;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }

    public Map<String, String> getResponses() {
        return responses;
    }

    public void setResponses(Map<String, String> responses) {
        this.responses = responses;
    }
}
