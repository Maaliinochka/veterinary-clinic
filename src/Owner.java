public class Owner {
    private int ownerId;
    private String name;
    private String address;
    private int phoneNumber;
    public Owner (int ownerId, String name, String address, int phoneNumber){
        this.ownerId=ownerId;
        this.name=name;
        this.address=address;
        this.phoneNumber=phoneNumber;
    }

    public int getOwnerId(){
        return ownerId;
    }
    public void setOwnerIdId(int ownerId){
        this.ownerId=ownerId;
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
