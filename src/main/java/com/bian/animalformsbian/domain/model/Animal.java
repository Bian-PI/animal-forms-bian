package com.bian.animalformsbian.domain.model;

import java.util.Map;

public class Animal extends BaseSection {

    public Animal() {
    }

    public Animal(String score, String weight, Map<String, String> responses) {
        super(score, weight, responses);
    }
}
