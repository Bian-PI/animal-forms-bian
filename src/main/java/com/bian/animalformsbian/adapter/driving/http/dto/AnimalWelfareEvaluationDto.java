package com.bian.animalformsbian.adapter.driving.http.dto;

import java.util.List;
import java.util.Map;

public class AnimalWelfareEvaluationDto {
    private String id;
    private String userId;
    private String evaluationId;
    private String evaluationDate;
    private String language;
    private String species;
    private String farmName;
    private String farmLocation;
    private String evaluatorName;
    private String status;
    private String overallScore;
    private String complianceLevel;
    private CategoriesDto categories;
    private List<Map<String, String>> criticalPoints;
    private List<Map<String, String>> strongPoints;
    private List<String> recommendations;

    public AnimalWelfareEvaluationDto() {
    }

    public AnimalWelfareEvaluationDto(String id, String userId, String evaluationId, String evaluationDate, String language, String species, String farmName, String farmLocation, String evaluatorName, String status, String overallScore, String complianceLevel, CategoriesDto categories, List<Map<String, String>> criticalPoints, List<Map<String, String>> strongPoints, List<String> recommendations) {
        this.id = id;
        this.userId = userId;
        this.evaluationId = evaluationId;
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

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getEvaluationId() {
        return evaluationId;
    }

    public void setEvaluationId(String evaluationId) {
        this.evaluationId = evaluationId;
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

    public CategoriesDto getCategories() {
        return categories;
    }

    public void setCategories(CategoriesDto categories) {
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
