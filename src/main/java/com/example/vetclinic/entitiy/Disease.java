package com.example.vetclinic.entitiy;

public class Disease {
    private int diseaseID;
    private String commonName;
    private String scientificName;

    public Disease(int diseaseID, String commonName, String scientificName) {
        this.diseaseID = diseaseID;
        this.commonName = commonName;
        this.scientificName = scientificName;
    }

    public int getDiseaseID() {
        return diseaseID;
    }

    public void setDiseaseID(int diseaseID) {
        this.diseaseID = diseaseID;
    }

    public String getCommonName() {
        return commonName;
    }

    public void setCommonName(String commonName) {
        this.commonName = commonName;
    }

    public String getScientificName() {
        return scientificName;
    }

    public void setScientificName(String scientificName) {
        this.scientificName=scientificName;
    }
}
