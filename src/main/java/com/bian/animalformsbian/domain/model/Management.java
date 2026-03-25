package com.bian.animalformsbian.domain.model;

import java.util.Map;

public class Management extends BaseSection {
    public Management() {
    }

    public Management(String score, String weight, Map<String, String> responses) {
        super(score, weight, responses);
    }
}
