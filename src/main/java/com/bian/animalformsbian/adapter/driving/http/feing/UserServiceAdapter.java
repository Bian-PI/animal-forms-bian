package com.bian.animalformsbian.adapter.driving.http.feing;

import com.bian.animalformsbian.adapter.driving.http.exception.ExternalServiceException;
import com.bian.animalformsbian.adapter.driving.http.exception.RoleNotAllowedException;
import com.bian.animalformsbian.adapter.driving.http.exception.UserNotFoundException;
import com.bian.animalformsbian.domain.api.IUserServicePort;
import feign.FeignException;
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
            boolean val = feingClient.isAdmin(userId);
            if (!val) {
                throw new RoleNotAllowedException();
            }
            return true;
        } catch (FeignException.NotFound e) {
            throw new UserNotFoundException();
        } catch (FeignException e) {
            throw new ExternalServiceException();
        }
    }
}
