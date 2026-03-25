package com.bian.animalformsbian.domain.model;

import java.util.Map;

public class Resource extends BaseSection {
    public Resource() {
    }

    public Resource(String score, String weight, Map<String, String> responses) {
        super(score, weight, responses);
    }
}
