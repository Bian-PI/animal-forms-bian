package com.bian.animalformsbian;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class AnimalFormsBianApplication {

    public static void main(String[] args) {
        SpringApplication.run(AnimalFormsBianApplication.class, args);
    }

}
