package Ironhack.schl.vehicle;

class Truck extends Car {
    private double towingCapacity;

    // Constructor
    public Truck(String vinNumber, String make, String model, int mileage, double towingCapacity) {
        super(vinNumber, make, model, mileage);
        this.towingCapacity = towingCapacity;
    }

    // Getter and setter
    public double getTowingCapacity() {
        return towingCapacity;
    }

    public void serTowingCapacity(double towingCapacity) {
        this.towingCapacity = towingCapacity;
    }

    @Override
    public String getInfo() {
        return "Truck: VIN Number: " + getVinNumber() + ", Make: " + getMake() +
                ", Model: " + getModel() + ", Mileage: "
                + getMileage() + "Towing Capacity: " + getTowingCapacity();
    }

}