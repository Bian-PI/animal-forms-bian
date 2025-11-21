package com.bian.animalformsbian.adapter.driven.mongo.document;

import java.util.Map;

public class FeedingDocument extends BaseSectionDocument {

    public FeedingDocument() {
    }

    public FeedingDocument(String score, Map<String, String> responses) {
        super(score, responses);
    }
}
