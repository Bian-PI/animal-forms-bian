package com.bian.animalformsbian.adapter.driving.http.dto;

public class CategoriesDto {
    private ResourceDto resource;
    private AnimalDto animal;
    private ManagementDto management;

    //Categorias para porcinos
    private TransportDto transport;
    private SlaughterDto behavior;

    public CategoriesDto() {
    }

    public CategoriesDto(ResourceDto resource, AnimalDto animal, ManagementDto management, TransportDto transport, SlaughterDto behavior) {
        this.resource = resource;
        this.animal = animal;
        this.management = management;
        this.transport = transport;
        this.behavior = behavior;
    }

    public ResourceDto getResource() {
        return resource;
    }

    public void setResource(ResourceDto resource) {
        this.resource = resource;
    }

    public AnimalDto getAnimal() {
        return animal;
    }

    public void setAnimal(AnimalDto animal) {
        this.animal = animal;
    }

    public ManagementDto getManagement() {
        return management;
    }

    public void setManagement(ManagementDto management) {
        this.management = management;
    }

    public TransportDto getTransport() {
        return transport;
    }

    public void setTransport(TransportDto transport) {
        this.transport = transport;
    }

    public SlaughterDto getBehavior() {
        return behavior;
    }

    public void setBehavior(SlaughterDto behavior) {
        this.behavior = behavior;
    }
}
