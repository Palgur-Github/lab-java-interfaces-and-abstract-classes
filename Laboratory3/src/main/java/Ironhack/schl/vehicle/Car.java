package Ironhack.schl.vehicle;

public abstract class Car {
    private String vinNumber;
    private String make;
    private String model;
    private int mileage;

    // Constructor

    public Car(String vinNumber, String make, String model, int mileage) {
        this.vinNumber = vinNumber;
        this.make = make;
        this.model = model;
        this.mileage = mileage;
    }

    //Getters

    public String getVinNumber() {

        return vinNumber;
    }

    public String getMake() {
        return make;
    }

    public String getModel() {

        return model;
    }

    public int getMileage() {

        return mileage;
    }

    // Setters

    public void setVinNumber(String vinNumber) {
        this.vinNumber = vinNumber;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setMileage(int mileage) {
        this.mileage = mileage;
    }

    // Abstract methods
    public abstract String getInfo();

}
