package com.bian.animalformsbian.domain.model;

import java.util.Map;

public class Resources extends BaseSection {
    public Resources() {
    }

    public Resources(String score, String weight, Map<String, String> responses) {
        super(score, weight, responses);
    }
}
