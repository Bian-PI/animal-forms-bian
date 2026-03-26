package com.bian.animalformsbian.adapter.driven.mongo.document;

public class CategoriesDocument {
    private ResourcesDocument resources;
    private AnimalDocument animal;
    private ManagementDocument management;

    //Categorias para porcinos
    private TransportDocument transport;
    private SlaughterDocument slaughter;

    public CategoriesDocument() {
    }

    public CategoriesDocument(ResourcesDocument resources, AnimalDocument animal, ManagementDocument management, TransportDocument transport, SlaughterDocument slaughter) {
        this.resources = resources;
        this.animal = animal;
        this.management = management;
        this.transport = transport;
        this.slaughter = slaughter;
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

    public TransportDocument getTransport() {
        return transport;
    }

    public void setTransport(TransportDocument transport) {
        this.transport = transport;
    }

    public SlaughterDocument getSlaughter() {
        return slaughter;
    }

    public void setSlaughter(SlaughterDocument slaughter) {
        this.slaughter = slaughter;
    }
}
