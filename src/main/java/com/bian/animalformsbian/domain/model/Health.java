package com.bian.animalformsbian.domain.model;

import java.util.Map;

public class Health extends BaseSection {
    public Health() {
    }

    public Health(String score, Map<String, String> responses) {
        super(score, responses);
    }
}
