package com.bian.animalformsbian.adapter.driving.http.dto;

public class CategoriesDto {
    private ResourcesDto resources;
    private AnimalDto animal;
    private ManagementDto management;

    //Categorias para porcinos
    private TransportDto transport;
    private SlaughterDto slaughter;

    public CategoriesDto() {
    }

    public CategoriesDto(ResourcesDto resources, AnimalDto animal, ManagementDto management, TransportDto transport, SlaughterDto slaughter) {
        this.resources = resources;
        this.animal = animal;
        this.management = management;
        this.transport = transport;
        this.slaughter = slaughter;
    }

    public ResourcesDto getResources() {
        return resources;
    }

    public void setResources(ResourcesDto resources) {
        this.resources = resources;
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

    public SlaughterDto getSlaughter() {
        return slaughter;
    }

    public void setSlaughter(SlaughterDto slaughter) {
        this.slaughter = slaughter;
    }
}
