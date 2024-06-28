package com.example.vetclinic.entitiy;

public class Appointment {
    private int appointmentID;
    private String startDateTime;
    private int animalID;
    private int ownerID;
    private int doctorID;

    public Appointment(int appointmentID, String startDateTime, int animalID, int ownerID, int doctorID){
        this.appointmentID=appointmentID;
        this.startDateTime=startDateTime;
        this.animalID=animalID;
        this.ownerID=ownerID;
        this.doctorID=doctorID;
    }

    public int getAppointmentID(){
        return appointmentID;
    }
    public void setAppointmentID(int appointmentID){
        this.appointmentID=appointmentID;
    }

    public String getStartDateTime(){
        return startDateTime;
    }
    public void setStartDateTime(String startDateTime){
        this.startDateTime=startDateTime;
    }

    public int getAnimalID(){
        return animalID;
    }
    public void setAnimalID(int animalID){
        this.animalID=animalID;
    }

    public int getOwnerID(){
        return ownerID;
    }
    public void setOwnerID(int ownerID){
        this.ownerID=ownerID;
    }

    public int getDoctorID(){
        return doctorID;
    }
    public void setDoctorID(int doctorID){
        this.doctorID=doctorID;
    }
}
