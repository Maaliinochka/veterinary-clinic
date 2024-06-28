package com.example.vetclinic.entitiy;

public class Breed{
    private int breedId;
    private String breedName;

    public Breed(int breedId, String breedName){
        this.breedId=breedId;
        this.breedName=breedName;
    }

    public int getBreedId(){
        return breedId;
    }
    public void setBreedId(int breedId){
        this.breedId=breedId;
    }

    public String getBreedName(){
        return breedName;
    }
    public void setBreedName(String breedName){
        this.breedName=breedName;
    }
}
