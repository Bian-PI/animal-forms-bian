package com.bian.animalformsbian.adapter.driven.mongo.document;

import java.util.Map;

public class TransportDocument extends BaseSectionDocument {
    public TransportDocument() {
    }

    public TransportDocument(String score, String weight, Map<String, String> responses) {
        super(score, weight, responses);
    }
}
