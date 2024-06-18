package Ironhack.schl.vehicle;

class UtilityVehicle extends Car {
    private boolean fourWheelDrive;

    //Constructor
    public UtilityVehicle(String vinNumber, String make, String model, int mileage, boolean fourWheelDrive) {
        super(vinNumber, make, model, mileage);
        this.fourWheelDrive = fourWheelDrive;
    }

    // Getter and setter
    public boolean getFourWheelDrive() {
        return fourWheelDrive;
    }

    public void isFourWheelDrive(boolean fourWheelDrive) {
        this.fourWheelDrive = true;
    }

    public String getInfo() {
        return "Utility Vehicle: VIN Number: " + getVinNumber() + ", Make: " + getMake() +
                ", Model: " + getModel() + ", Mileage: " + getMileage() + "Four-wheel Drive" + getFourWheelDrive();
    }
}