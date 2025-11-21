package com.bian.animalformsbian.adapter.driven.mongo.document;

import java.util.Map;

public class BehaviorDocument extends BaseSectionDocument {
    public BehaviorDocument() {
    }

    public BehaviorDocument(String score, Map<String, String> responses) {
        super(score, responses);
    }
}
