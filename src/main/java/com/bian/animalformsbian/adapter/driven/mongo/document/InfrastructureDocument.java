package com.bian.animalformsbian.adapter.driven.mongo.document;

import java.util.Map;

public class InfrastructureDocument extends BaseSectionDocument {
    public InfrastructureDocument() {
    }

    public InfrastructureDocument(String score, Map<String, String> responses) {
        super(score, responses);
    }
}
