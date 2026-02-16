package OwnExercises;

public class Car {
    private String carBrand;
    private int carFuel;
    private int carSpeed;

    public Car(String brand, int fuel) {
        this.carBrand = brand;
        this.carFuel = fuel;
        this.carSpeed = 0;
    }

    public void accelerate() {
        if (carFuel >= 5) {
            carSpeed = carSpeed + 10;
            carFuel = carFuel - 5;
        }
    }

    public void brake() {
        carSpeed = carSpeed - 10;
        if (carSpeed < 0) {
            carSpeed = 0;
        }
    }

    public void refuel(int amount) {
        carFuel = carFuel + amount;
    }

    public int getSpeed() {
        return carSpeed;
    }
    public int getFuel() {
        return carFuel;
    }
    public String getBrand() {
        return carBrand;
    }
}
