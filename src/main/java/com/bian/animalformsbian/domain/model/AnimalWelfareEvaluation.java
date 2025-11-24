package com.bian.animalformsbian.domain.model;

import java.util.List;
import java.util.Map;

public class AnimalWelfareEvaluation {
    private String id;
    private String connectionStatus;
    private String userId;
    private String evaluationDate;
    private String language;
    private String species;
    private String farmName;
    private String farmLocation;
    private String evaluatorName;
    private String status;
    private String overallScore;
    private String complianceLevel;
    private Categories categories;
    private List<Map<String, String>> criticalPoints;
    private List<Map<String, String>> strongPoints;
    private List<String> recommendations;

    public AnimalWelfareEvaluation() {
    }

    public AnimalWelfareEvaluation(String id, String connectionStatus, String userId, String evaluationDate, String language, String species, String farmName, String farmLocation, String evaluatorName, String status, String overallScore, String complianceLevel, Categories categories, List<Map<String, String>> criticalPoints, List<Map<String, String>> strongPoints, List<String> recommendations) {
        this.id = id;
        this.connectionStatus = connectionStatus;
        this.userId = userId;
        this.evaluationDate = evaluationDate;
        this.language = language;
        this.species = species;
        this.farmName = farmName;
        this.farmLocation = farmLocation;
        this.evaluatorName = evaluatorName;
        this.status = status;
        this.overallScore = overallScore;
        this.complianceLevel = complianceLevel;
        this.categories = categories;
        this.criticalPoints = criticalPoints;
        this.strongPoints = strongPoints;
        this.recommendations = recommendations;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getConnectionStatus() {
        return connectionStatus;
    }

    public void setConnectionStatus(String connectionStatus) {
        this.connectionStatus = connectionStatus;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getEvaluationDate() {
        return evaluationDate;
    }

    public void setEvaluationDate(String evaluationDate) {
        this.evaluationDate = evaluationDate;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public String getFarmName() {
        return farmName;
    }

    public void setFarmName(String farmName) {
        this.farmName = farmName;
    }

    public String getFarmLocation() {
        return farmLocation;
    }

    public void setFarmLocation(String farmLocation) {
        this.farmLocation = farmLocation;
    }

    public String getEvaluatorName() {
        return evaluatorName;
    }

    public void setEvaluatorName(String evaluatorName) {
        this.evaluatorName = evaluatorName;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getOverallScore() {
        return overallScore;
    }

    public void setOverallScore(String overallScore) {
        this.overallScore = overallScore;
    }

    public String getComplianceLevel() {
        return complianceLevel;
    }

    public void setComplianceLevel(String complianceLevel) {
        this.complianceLevel = complianceLevel;
    }

    public Categories getCategories() {
        return categories;
    }

    public void setCategories(Categories categories) {
        this.categories = categories;
    }

    public List<Map<String, String>> getCriticalPoints() {
        return criticalPoints;
    }

    public void setCriticalPoints(List<Map<String, String>> criticalPoints) {
        this.criticalPoints = criticalPoints;
    }

    public List<Map<String, String>> getStrongPoints() {
        return strongPoints;
    }

    public void setStrongPoints(List<Map<String, String>> strongPoints) {
        this.strongPoints = strongPoints;
    }

    public List<String> getRecommendations() {
        return recommendations;
    }

    public void setRecommendations(List<String> recommendations) {
        this.recommendations = recommendations;
    }
}
