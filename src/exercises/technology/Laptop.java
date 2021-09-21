package exercises.technology;

public class Laptop extends Computer{
    public static double specificID;
    private double weight;

    public Laptop(String brand, int storage, int ram, double weight) {
        super(brand, storage, ram, specificID);
        this.weight = weight;
    }
    public boolean isClunky() {
        if (weight > 5.0) {
            return true;
        }
            else {
                return false;
        }
    }
}
