package Lesson17.Comparable.Car;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortCars {
    public static void main(String[] args) {
        // 7. ArrayList<Car>
        List<Car> cars = new ArrayList<>();

        // 8. Tilføj biler
        cars.add(new Car("BC123"));
        cars.add(new Car("AA456"));
        cars.add(new Car("ZZ999"));
        cars.add(new Car("AB222"));
        cars.add(new Car("CC789"));

        // 9. Udskriv original listen
        for (Car c : cars) {
            System.out.println(c);
        }

        // 10. Sortér
        Collections.sort(cars);

        // 11. Udskriv sorteret listen
        System.out.println("");
        for (Car c : cars) {
            System.out.println(c);
        }

    }
}


