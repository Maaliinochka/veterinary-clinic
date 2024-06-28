package com.example.vetclinic.entitiy;

public class User {
    private int userId;
    private String name;
    private String address;
    private String phoneNumber;
    private String password;



    public User(int id, String name, String address, String phoneNumber, String password) {
        this.userId = id;
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.password = password;
    }

    public String getPassword() {
        return password;
    }
    public int getUserId() {
        return userId;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }
}
