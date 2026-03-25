package com.bian.animalformsbian.domain.model;

import java.util.Map;

public class Slaughter extends BaseSection {
    public Slaughter() {
    }

    public Slaughter(String score, String weight, Map<String, String> responses) {
        super(score, weight, responses);
    }
}
