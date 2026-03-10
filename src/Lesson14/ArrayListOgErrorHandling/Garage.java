package Lesson14.ArrayListOgErrorHandling;

import java.util.ArrayList;
//Garage
class Garage {
    private ArrayList<Car> cars = new ArrayList<>();

    public void addCar(Car car) {
        cars.add(car);
    }

    public void listCars() {
        System.out.println("Cars in the garage:");
        for (int i = 0; i < cars.size(); i++) {
            System.out.println(i + ": " + cars.get(i).getInfo());
        }
    }

    public void removeCar(int index) {
        try {
            Car removed = cars.remove(index);
            System.out.println("Removed: " + removed.getInfo());
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Error: No car at index " + index);
        }
    }
}
