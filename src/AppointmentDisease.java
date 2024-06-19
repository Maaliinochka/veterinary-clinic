public class AppointmentDisease {
    private int appointmentID;
    private int diseaseID;

    public AppointmentDisease(int appointmentID, int diseaseID){
        this.appointmentID=appointmentID;
        this.diseaseID=diseaseID;
    }

    public int getAppointmentID(){
        return appointmentID;
    }
    public void setAppointmentID(int breedId){
        this.appointmentID=breedId;
    }

    public int getDiseaseID(){
        return diseaseID;
    }
    public void setDiseaseID(int diseaseID){
        this.diseaseID=diseaseID;
    }
}
