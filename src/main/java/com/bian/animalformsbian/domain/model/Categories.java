package com.bian.animalformsbian.domain.model;

public class Categories {
    private Feeding feeding;
    private Health health;
    private Behavior behavior;
    private Infrastructure infrastructure;
    private Management management;

    public Categories() {
    }

    public Categories(Feeding feeding, Health health, Behavior behavior, Infrastructure infrastructure, Management management) {
        this.feeding = feeding;
        this.health = health;
        this.behavior = behavior;
        this.infrastructure = infrastructure;
        this.management = management;
    }

    public Feeding getFeeding() {
        return feeding;
    }

    public void setFeeding(Feeding feeding) {
        this.feeding = feeding;
    }

    public Health getHealth() {
        return health;
    }

    public void setHealth(Health health) {
        this.health = health;
    }

    public Behavior getBehavior() {
        return behavior;
    }

    public void setBehavior(Behavior behavior) {
        this.behavior = behavior;
    }

    public Infrastructure getInfrastructure() {
        return infrastructure;
    }

    public void setInfrastructure(Infrastructure infrastructure) {
        this.infrastructure = infrastructure;
    }

    public Management getManagement() {
        return management;
    }

    public void setManagement(Management management) {
        this.management = management;
    }
}
