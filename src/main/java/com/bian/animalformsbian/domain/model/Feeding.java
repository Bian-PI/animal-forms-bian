package com.bian.animalformsbian.domain.model;

public class Feeding extends BaseSection{
    private boolean waterAccessPigs;
    private boolean feedQualityPigs;
    private boolean feedersSufficientPigs;
    private double feedFrequency;

    public Feeding() {}

    public Feeding(double score, boolean waterAccessPigs, boolean feedQualityPigs, boolean feedersSufficientPigs, double feedFrequency) {
        super(score);
        this.waterAccessPigs = waterAccessPigs;
        this.feedQualityPigs = feedQualityPigs;
        this.feedersSufficientPigs = feedersSufficientPigs;
        this.feedFrequency = feedFrequency;
    }

    public boolean isWaterAccessPigs() {
        return waterAccessPigs;
    }

    public void setWaterAccessPigs(boolean waterAccessPigs) {
        this.waterAccessPigs = waterAccessPigs;
    }

    public boolean isFeedQualityPigs() {
        return feedQualityPigs;
    }

    public void setFeedQualityPigs(boolean feedQualityPigs) {
        this.feedQualityPigs = feedQualityPigs;
    }

    public boolean isFeedersSufficientPigs() {
        return feedersSufficientPigs;
    }

    public void setFeedersSufficientPigs(boolean feedersSufficientPigs) {
        this.feedersSufficientPigs = feedersSufficientPigs;
    }

    public double getFeedFrequency() {
        return feedFrequency;
    }

    public void setFeedFrequency(double feedFrequency) {
        this.feedFrequency = feedFrequency;
    }
}
