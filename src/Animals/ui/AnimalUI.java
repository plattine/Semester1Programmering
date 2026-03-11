package Animals.ui;

import Animals.model.*;
import Animals.service.AnimalFileHandler;

import java.util.ArrayList;

public class AnimalUI {

    ArrayList<Animal> animalArray = new ArrayList<>();

    public void addAnimals() {
        Dog dog1 = new Dog("Boris", 3, "Rubber bone");
        Dog dog2 = new Dog("Lina", 5, "Wood stick");
        Cat cat1 = new Cat("Otto", 4, "sleeping on the couch");
        Bird bird1 = new Bird("Tweety", 2, 19.00);

        animalArray.add(dog1);
        animalArray.add(dog2);
        animalArray.add(cat1);
        animalArray.add(bird1);
    }

    public ArrayList<Animal> getAnimalArray() {
        return animalArray;
    }
}
