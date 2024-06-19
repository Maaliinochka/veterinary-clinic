public class Animal {
    private int animalID;
    private String name;
    private int breedID;
    private int ownerID;
    public Animal(int animalID, String name, int breedID, int ownerID){
        this.animalID=animalID;
        this.name=name;
        this.breedID=breedID;
        this.ownerID=ownerID;
    }

    public int  getAnimalID(){
        return animalID;
    }
    public void setAnimalID(int animalID){
        this.animalID=animalID;
    }

    public String  getName(){
        return name;
    }
    public void setName(String name){
        this.name=name;
    }

    public int  getbBeedID(){
        return breedID;
    }
    public void setBreedID(int breedIDd){
        this.breedID=breedID;
    }

    public int  getOwnerID(){
        return ownerID;
    }
    public void setOwnerID(int ownerID){
        this.ownerID=ownerID;
    }
}
