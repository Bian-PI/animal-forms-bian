package com.bian.animalformsbian.domain.model;

public class Categories {
    private Resource resource;
    private Animal animal;
    private Management management;

    //Categorias para porcinos
    private Transport transport;
    private Slaughter slaughter;


    public Categories() {
    }

    public Categories(Resource resource, Animal animal, Management management, Transport transport, Slaughter slaughter) {
        this.resource = resource;
        this.animal = animal;
        this.management = management;
        this.transport = transport;
        this.slaughter = slaughter;
    }

    public Resource getResource() {
        return resource;
    }

    public void setResource(Resource resource) {
        this.resource = resource;
    }

    public Animal getAnimal() {
        return animal;
    }

    public void setAnimal(Animal animal) {
        this.animal = animal;
    }

    public Management getManagement() {
        return management;
    }

    public void setManagement(Management management) {
        this.management = management;
    }

    public Transport getTransport() {
        return transport;
    }

    public void setTransport(Transport transport) {
        this.transport = transport;
    }

    public Slaughter getSlaughter() {
        return slaughter;
    }

    public void setSlaughter(Slaughter slaughter) {
        this.slaughter = slaughter;
    }
}
