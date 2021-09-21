package exercises.technology;

public class SmartPhone extends Computer{
    public static double specificID;
    private int numberOfSelfies;

    public SmartPhone(String brand, int storage, int ram, int numberOfSelfies, double specificID) {
        super(brand, storage, ram, specificID);
        this.numberOfSelfies = numberOfSelfies;
    }

    public void takeSelfie() {
        this.numberOfSelfies = this.numberOfSelfies + 1;
    }

    public int getNumberOfSelfies() {
        return numberOfSelfies;
    }

    public void setNumberOfSelfies(int numberOfSelfies) {
        this.numberOfSelfies = numberOfSelfies;
    }
}
