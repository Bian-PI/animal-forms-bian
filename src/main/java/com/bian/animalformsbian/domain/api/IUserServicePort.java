package com.bian.animalformsbian.domain.api;

public interface IUserServicePort {
    String getUserIdByDocument(String document);
    Boolean isUserAdmin(Long userId);
}
