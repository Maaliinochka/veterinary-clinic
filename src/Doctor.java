public class Doctor {
    private int doctorId;
    private String name;
    private String address;
    private int phoneNumber;
    public Doctor(int doctorId, String name, String address, int phoneNumber){
        this.doctorId=doctorId;
        this.name=name;
        this.address=address;
        this.phoneNumber=phoneNumber;
    }

    public int getDoctorIdId(){
        return doctorId;
    }
    public void setDoctorIdId(int doctorId){
        this.doctorId=doctorId;
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
