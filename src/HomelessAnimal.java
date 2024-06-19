public class HomelessAnimal {
    private int homelessAnimalId;
    private String name;
    private int breedID;
    private int ownerID;
    public HomelessAnimal(int homelessAnimalId, String name, int breedID, int ownerID){
        this.homelessAnimalId=homelessAnimalId;
        this.name=name;
        this.breedID=breedID;
        this.ownerID=ownerID;
    }

    public int  getHomelessAnimalIdId(){
        return homelessAnimalId;
    }
    public void setHomelessAnimalIdId(int homelessAnimalId){
        this.homelessAnimalId=homelessAnimalId;
    }

    public String  getName(){
        return name;
    }
    public void setName(String name){
        this.name=name;
    }

    public int  getbBeedId(){
        return breedID;
    }
    public void setBreedId(int id){
        this.breedID=breedID;
    }

    public int  getOwnerId(){
        return ownerID;
    }
    public void setOwnerId(int id){
        this.ownerID=ownerID;
    }
}
