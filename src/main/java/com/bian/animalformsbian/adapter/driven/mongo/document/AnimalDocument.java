package com.bian.animalformsbian.adapter.driven.mongo.document;

import java.util.Map;

public class AnimalDocument extends BaseSectionDocument {
    public AnimalDocument() {
    }

    public AnimalDocument(String score, String weight, Map<String, String> responses) {
        super(score, weight, responses);
    }
}
