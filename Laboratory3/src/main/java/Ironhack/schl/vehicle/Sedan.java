package Ironhack.schl.vehicle;

class Sedan extends Car {

    public Sedan(String vinNumber, String make, String model, int mileage) {
        super(vinNumber, make, model, mileage);
    }

    //Method

    @Override
    public String getInfo() {
        return "Sedan: VIN Number: " + getVinNumber() + ", Make: " + getMake() +
                ", Model: " + getModel() + ", Mileage: " + getMileage();
    }

}