package com.bian.animalformsbian.adapter.driven.mongo.document;

import java.util.Map;

public class HealthDocument extends BaseSectionDocument {
    public HealthDocument() {
    }

    public HealthDocument(String score, Map<String, String> responses) {
        super(score, responses);
    }
}
