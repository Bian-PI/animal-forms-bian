package com.bian.animalformsbian.adapter.driven.mongo.document;

import java.util.Map;

public class SlaughterDocument extends BaseSectionDocument {
    public SlaughterDocument() {
    }

    public SlaughterDocument(String score, String weight, Map<String, String> responses) {
        super(score, weight, responses);
    }
}
