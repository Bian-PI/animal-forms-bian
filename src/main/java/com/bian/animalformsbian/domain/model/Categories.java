package com.bian.animalformsbian.domain.model;

public class Categories {
    private Resources resources;
    private Animal animal;
    private Management management;

    //Categorias para porcinos
    private Transport transport;
    private Slaughter slaughter;


    public Categories() {
    }

    public Categories(Resources resources, Animal animal, Management management, Transport transport, Slaughter slaughter) {
        this.resources = resources;
        this.animal = animal;
        this.management = management;
        this.transport = transport;
        this.slaughter = slaughter;
    }

    public Resources getResources() {
        return resources;
    }

    public void setResources(Resources resources) {
        this.resources = resources;
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
