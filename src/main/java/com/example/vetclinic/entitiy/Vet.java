package com.example.vetclinic.entitiy;

public class Vet {
    private int vetId;
    private String name;
    private String address;
    private int phoneNumber;
    public Vet(int vetId, String name, String address, int phoneNumber){
        this.vetId=vetId;
        this.name=name;
        this.address=address;
        this.phoneNumber=phoneNumber;
    }

    public int getVetId(){
        return vetId;
    }
    public void setVetId(int vetId){
        this.vetId=vetId;
    }

    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name=name;
    }

    public String getAddress(){
        return address;
    }
    public void setAddress(String address){
        this.address=address;
    }

    public int getPhoneNumber(){
        return phoneNumber;
    }
    public void setPhoneNumber(int phoneNumber){
        this.phoneNumber=phoneNumber;
    }
}
