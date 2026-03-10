package Animals;
import java.util.ArrayList;
import java.io.FileWriter;
import java.io.IOException;

public class AnimalTest {

    public static void main(String[] args) {

        ArrayList<Animal> animalArray = new ArrayList<>();

        Dog dog1 = new Dog("Boris", 3, "Rubber bone");
        Dog dog2 = new Dog("Lina", 5, "Wood stick");
        Cat cat1 = new Cat("Otto", 4, "sleeping on the couch");
        Bird bird1 = new Bird("Tweety", 2, 19.00);

        animalArray.add(dog1);
        animalArray.add(dog2);
        animalArray.add(cat1);
        animalArray.add(bird1);

        try {
            FileWriter writer = new FileWriter("src/Animals/animals.txt");

            for (Animal a : animalArray) {

            writer.write(a.toString() + "\n" + a.favoriteFood() + "\n" + a.makesSound() + "\n----------------");
                writer.write("\n");
            }


            writer.close(); }

        catch (IOException e) {
                e.printStackTrace();
            }




    }




}
