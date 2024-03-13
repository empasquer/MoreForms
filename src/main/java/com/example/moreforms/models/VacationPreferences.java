package com.example.moreforms.models;

import java.util.ArrayList;

public class VacationPreferences {
    private String name, keywords, destination;
    private TypeOfTravels typeOfTravel;
    private ArrayList<String> features;

    public VacationPreferences() {
    }

    public String getName() {
        return name;
    }

    public String getKeywords() {
        return keywords;
    }

    public String getDestination() {
        return destination;
    }

    public TypeOfTravels getTypeOfTravel() {
        return typeOfTravel;
    }

    public ArrayList<String> getFeatures() {
        return features;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setKeywords(String keywords) {
        this.keywords = keywords;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public void setTypeOfTravel(TypeOfTravels typeOfTravel) {
        this.typeOfTravel = typeOfTravel;
    }

    public void setFeatures(ArrayList<String> features) {
        this.features = features;
    }
}
