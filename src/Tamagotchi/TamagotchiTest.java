package Tamagotchi;

import java.util.ArrayList;
import java.util.Scanner;


public class TamagotchiTest {
    public static void main(String[] args) {

        ArrayList<Tamagotchi> tama = new ArrayList<Tamagotchi>();

        Scanner input = new Scanner(System.in);
        System.out.println("Hello, would you like to create a dog or a cat? " +
                "Press 1 for dog and 2 for cat.");
        int choice = input.nextInt();
        input.nextLine();
        if (choice == 1) {
            System.out.println("Ah, you would like to create a dog! What should the name of the dog be?");
            String name = input.nextLine();
            int energy = (int)(Math.random() * 20);
            tama.add(new Dog(name, energy));
            System.out.println("Okay, here is your dog " + name + " with energy " + energy + ". ");
            System.out.println("  __      _\n" +
                    "o'')}____//\n" +
                    " `_/      )\n" +
                    " (_(_/-(_/\n");
        } else if (choice == 2) {
            System.out.println("Ah, you would like to create a cat! What should the name of the cat be?");
            String name = input.nextLine();
            int energy = (int)(Math.random() * 20);
            tama.add(new Cat(name, energy));
            System.out.println("Okay, here is your cat " + name + " with energy " + energy + ". ");
            System.out.println(" _._     _,-'\"\"`-._\n" +
                    "(,-.`._,'(       |\\`-/|\n" +
                    "    `-.-' \\ )-`( , o o)\n" +
                    "          `-    \\`_`\"'-");
        } else {
            System.out.println("Invalid choice.");
            return;


        }


        while (true) {
            System.out.println("What would you like to do?\n1 - play\n2 - feed\n3 - sleep");
            int menuChoice = input.nextInt();
            input.nextLine();
            if (menuChoice == 1) {
                tama.get(0).play();
                System.out.println("Energy: " + tama.get(0).getEnergy());
            } else if (menuChoice == 2) {
                System.out.println("Choose between fish, bone, meat or milk.");
                String foodChoice = input.nextLine();

                Food selectedFood = null;

                if (foodChoice.equalsIgnoreCase("fish")) {
                    selectedFood = Food.FISH;
                } else if (foodChoice.equalsIgnoreCase("bone")) {
                    selectedFood = Food.BONE;
                } else if (foodChoice.equalsIgnoreCase("meat")) {
                    selectedFood = Food.MEAT;
                } else if (foodChoice.equalsIgnoreCase("milk")) {
                    selectedFood = Food.MILK;
                }
                tama.get(0).feed(selectedFood);

                System.out.println("Energy: " + tama.get(0).getEnergy());
            }
        }




    }
}
