package com.bian.animalformsbian.adapter.driven.mongo.document;

import java.util.Map;

public class ManagementDocument extends BaseSectionDocument {
    public ManagementDocument() {
    }

    public ManagementDocument(String score, Map<String, String> responses) {
        super(score, responses);
    }
}
