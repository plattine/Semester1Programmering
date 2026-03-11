package Animals.service;

import Animals.model.*;
import Animals.ui.AnimalUI;

import java.io.FileWriter;
import java.io.IOException;

import java.io.BufferedWriter;
import java.util.ArrayList;

public class AnimalFileHandler {

    public void saveFile(ArrayList<Animal> animalArray, String fileName) {
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(fileName));

            for (Animal a : animalArray) {

                writer.write(a.toString() + "\n" + a.favoriteFood() + "\n" + a.makesSound() + "\n----------------");
                writer.newLine();
            }
            writer.close();
            System.out.println("File write success");
        }

        catch (IOException e) {
            e.printStackTrace();
        }
    }
}

