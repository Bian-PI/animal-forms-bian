package com.bian.animalformsbian.domain.model;

public abstract class BaseSection {
    private double score;

    public BaseSection() {}

    public BaseSection(double score) {
        this.score = score;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }
}
