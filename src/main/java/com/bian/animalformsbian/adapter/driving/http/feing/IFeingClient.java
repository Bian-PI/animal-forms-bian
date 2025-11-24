package com.bian.animalformsbian.adapter.driving.http.feing;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "user-bian")
public interface IFeingClient {
    @GetMapping("/users/document/{document}")
    String getIdByDocument(@PathVariable("document") String document);

    @GetMapping("/users/is-admin/{id}")
    Boolean isAdmin(@PathVariable("id") Long id);
}
