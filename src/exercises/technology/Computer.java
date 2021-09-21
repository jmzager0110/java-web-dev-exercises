package exercises.technology;

public class Computer extends AbstractEntity{

    private String brand;
    private int storage;
    private int ram;
    private double specificID;

    public Computer(String brand, int storage, int ram, double specificID) {
        super();
        this.brand = brand;
        this.storage = storage;
        this.ram = ram;
        this.specificID = specificID;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getStorage() {
        return storage;
    }

    public void setStorage(int storage) {
        this.storage = storage;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public double getSpecificID() {
        return specificID;
    }

    public void setSpecificID(double specificID) {
        this.specificID = specificID;
    }
}
