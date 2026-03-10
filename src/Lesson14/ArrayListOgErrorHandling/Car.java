package Lesson14.ArrayListOgErrorHandling;

//Car
class Car {
    private String brand;
    private String model;
    private FuelType fuelType;

    public Car(String brand, String model, FuelType fuelType) {
        this.brand = brand;
        this.model = model;
        this.fuelType = fuelType;
    }

    public FuelType getFuelType() {
        return fuelType;
    }

    public String getInfo() {
        return brand + " " + model + " (" + fuelType + ")";
    }
}
