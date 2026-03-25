package com.bian.animalformsbian.adapter.driven.mongo.document;

import java.util.Map;

public class ResourcesDocument extends BaseSectionDocument {

    public ResourcesDocument() {
    }

    public ResourcesDocument(String score, String weight, Map<String, String> responses) {
        super(score, weight, responses);
    }
}
