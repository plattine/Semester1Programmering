package Lesson17.GuineaFarm.service;
import Lesson17.GuineaFarm.model.*;

import java.io.*;
import java.util.ArrayList;
import java.io.FileWriter;
import java.io.IOException;

/*
 This class handles all file operations.

 STUDENT TASKS:
 1) Read guinea pigs from a CSV file
 2) Convert CSV lines into GuineaPig objects
 3) Save the list back to CSV
*/

public class GuineaPigFileHandler {

    private static final String FILE_NAME = "src/Lesson17/GuineaFarm/guineapigs.csv";

    public ArrayList<GuineaPig> loadPigs() {

        ArrayList<GuineaPig> pigs = new ArrayList<>();

        try {

            BufferedReader reader =
                    new BufferedReader(new FileReader(FILE_NAME));

            String line;

            while ((line = reader.readLine()) != null) {

                String[] data = line.split(",");

                System.out.println("Name: " + data[0]);
                System.out.println("Age: " + data[1]);
                System.out.println("Weight: " + data[2]);
                System.out.println("Breed: " + data[3]);
                System.out.println("Color: " + data[4]);
                System.out.println("--------------");
                GuineaPig pig = new GuineaPig(
                        data[0],
                        Integer.parseInt(data[1]),
                        Double.parseDouble(data[2]),
                        Breed.valueOf(data[3]),
                        Color.valueOf(data[4]));

                pigs.add(pig);
            }

            reader.close();

        } catch (IOException e) {
            e.printStackTrace();
        }

        return pigs;
    }

    public void savePigs(ArrayList<GuineaPig> pigs) {

        try {

            BufferedWriter writer = new BufferedWriter(new FileWriter(FILE_NAME));

            for (GuineaPig pig : pigs) {

                writer.write(pig.getName() + "," +
                        pig.getAge() + "," +
                        pig.getWeight() + "," +
                        pig.getBreed() + "," +
                        pig.getColor());
                writer.newLine();
            }
            System.out.println("CSV file written successfully!");

            writer.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}