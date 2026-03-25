package com.bian.animalformsbian.adapter.driven.mongo.document;

public class CategoriesDocument {
    private ResourcesDocument resources;
    private AnimalDocument animal;
    private ManagementDocument management;

    //Categorias para porcinos
    private TransportDocument behavior;
    private SlaughterDocument infrastructure;

    public CategoriesDocument() {
    }

    public CategoriesDocument(ResourcesDocument resources, AnimalDocument animal, ManagementDocument management, TransportDocument behavior, SlaughterDocument infrastructure) {
        this.resources = resources;
        this.animal = animal;
        this.management = management;
        this.behavior = behavior;
        this.infrastructure = infrastructure;
    }

    public ResourcesDocument getResources() {
        return resources;
    }

    public void setResources(ResourcesDocument resources) {
        this.resources = resources;
    }

    public AnimalDocument getAnimal() {
        return animal;
    }

    public void setAnimal(AnimalDocument animal) {
        this.animal = animal;
    }

    public ManagementDocument getManagement() {
        return management;
    }

    public void setManagement(ManagementDocument management) {
        this.management = management;
    }

    public TransportDocument getBehavior() {
        return behavior;
    }

    public void setBehavior(TransportDocument behavior) {
        this.behavior = behavior;
    }

    public SlaughterDocument getInfrastructure() {
        return infrastructure;
    }

    public void setInfrastructure(SlaughterDocument infrastructure) {
        this.infrastructure = infrastructure;
    }
}
