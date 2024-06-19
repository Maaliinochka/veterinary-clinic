public class BreedDisease {
    private int breedId;
    private int diseaseID;

    public BreedDisease(int breedId, int diseaseID){
        this.breedId=breedId;
        this.diseaseID=diseaseID;
    }

    public int getBreedId(){
        return breedId;
    }
    public void setBreedId(int breedId){
        this.breedId=breedId;
    }

    public int getDiseaseID(){
        return diseaseID;
    }
    public void setDiseaseID(int diseaseID){
        this.diseaseID=diseaseID;
    }
}
