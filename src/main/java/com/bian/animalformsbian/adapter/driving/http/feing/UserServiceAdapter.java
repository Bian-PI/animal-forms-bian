package com.bian.animalformsbian.adapter.driving.http.feing;

import com.bian.animalformsbian.domain.api.IUserServicePort;
import org.springframework.stereotype.Component;

@Component
public class UserServiceAdapter implements IUserServicePort {
    private final IFeingClient feingClient;

    public UserServiceAdapter(IFeingClient feingClient) {
        this.feingClient = feingClient;
    }

    @Override
    public String getUserIdByDocument(String document) {
        try {
            return feingClient.getIdByDocument(document);
        } catch (Exception e) {
            // Log error
            return null;
        }
    }

    @Override
    public Boolean isUserAdmin(Long userId) {
        try {
            return feingClient.isAdmin(userId);
        } catch (Exception e) {
            // Log error
            return false;
        }
    }
}
