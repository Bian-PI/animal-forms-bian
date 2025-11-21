package com.bian.animalformsbian.adapter.driving.http.dto;

public class CategoriesDto {
    private FeedingDto feeding;
    private HealthDto health;
    private BehaviorDto behavior;
    private InfrastructureDto infrastructure;
    private ManagementDto management;

    public CategoriesDto() {
    }

    public CategoriesDto(FeedingDto feeding, HealthDto health, BehaviorDto behavior, InfrastructureDto infrastructure, ManagementDto management) {
        this.feeding = feeding;
        this.health = health;
        this.behavior = behavior;
        this.infrastructure = infrastructure;
        this.management = management;
    }

    public FeedingDto getFeeding() {
        return feeding;
    }

    public void setFeeding(FeedingDto feeding) {
        this.feeding = feeding;
    }

    public HealthDto getHealth() {
        return health;
    }

    public void setHealth(HealthDto health) {
        this.health = health;
    }

    public BehaviorDto getBehavior() {
        return behavior;
    }

    public void setBehavior(BehaviorDto behavior) {
        this.behavior = behavior;
    }

    public InfrastructureDto getInfrastructure() {
        return infrastructure;
    }

    public void setInfrastructure(InfrastructureDto infrastructure) {
        this.infrastructure = infrastructure;
    }

    public ManagementDto getManagement() {
        return management;
    }

    public void setManagement(ManagementDto management) {
        this.management = management;
    }
}
