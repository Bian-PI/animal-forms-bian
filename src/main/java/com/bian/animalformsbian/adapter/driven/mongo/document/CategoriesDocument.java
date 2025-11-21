package com.bian.animalformsbian.adapter.driven.mongo.document;

public class CategoriesDocument {
    private FeedingDocument feeding;
    private HealthDocument health;
    private BehaviorDocument behavior;
    private InfrastructureDocument infrastructure;
    private ManagementDocument management;

    public CategoriesDocument() {
    }

    public CategoriesDocument(FeedingDocument feedingDocument, HealthDocument healthDocument, BehaviorDocument behaviorDocument, InfrastructureDocument infrastructureDocument, ManagementDocument managementDocument) {
        this.feeding = feedingDocument;
        this.health = healthDocument;
        this.behavior = behaviorDocument;
        this.infrastructure = infrastructureDocument;
        this.management = managementDocument;
    }

    public FeedingDocument getFeeding() {
        return feeding;
    }

    public void setFeeding(FeedingDocument feedingDocument) {
        this.feeding = feedingDocument;
    }

    public HealthDocument getHealth() {
        return health;
    }

    public void setHealth(HealthDocument healthDocument) {
        this.health = healthDocument;
    }

    public BehaviorDocument getBehavior() {
        return behavior;
    }

    public void setBehavior(BehaviorDocument behaviorDocument) {
        this.behavior = behaviorDocument;
    }

    public InfrastructureDocument getInfrastructure() {
        return infrastructure;
    }

    public void setInfrastructure(InfrastructureDocument infrastructureDocument) {
        this.infrastructure = infrastructureDocument;
    }

    public ManagementDocument getManagement() {
        return management;
    }

    public void setManagement(ManagementDocument managementDocument) {
        this.management = managementDocument;
    }
}
