package Tamagotchi;

import java.util.ArrayList;
import java.util.Scanner;


public class TamagotchiTest {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        Tamagotchi pet = createPet(input);

        gameLoop(pet, input);
    }

    public static Tamagotchi createPet(Scanner input) {
        while (true) {
            System.out.println("Hello, would you like to create a dog or a cat? " +
                    "Press 1 for dog and 2 for cat.");
            int choice = input.nextInt();
            input.nextLine();
            if (choice == 1) {
                System.out.println("Ah, you would like to create a dog! What should the name of the dog be?");
                String name = input.nextLine();
                int energy = (int) (Math.random() * 20);
                System.out.println("Okay, here is your dog " + name + " with energy " + energy + ". ");
                System.out.println("  __      _\n" +
                        "o'')}____//\n" +
                        " `_/      )\n" +
                        " (_(_/-(_/\n");
                return new Dog(name, energy);
            } else if (choice == 2) {
                System.out.println("Ah, you would like to create a cat! What should the name of the cat be?");
                String name = input.nextLine();
                int energy = (int) (Math.random() * 20);
                System.out.println("Okay, here is your cat " + name + " with energy " + energy + ". ");
                System.out.println(" _._     _,-'\"\"`-._\n" +
                        "(,-.`._,'(       |\\`-/|\n" +
                        "    `-.-' \\ )-`( , o o)\n" +
                        "          `-    \\`_`\"'-");
                return new Cat(name, energy);
            } else {
                System.out.println("Invalid choice.");


            }
        }
    }


    public static void gameLoop(Tamagotchi pet, Scanner input) {

        while (true) {
            System.out.println("What would you like to do?\n1 - play\n2 - feed\n3 - sleep\n4 - quit");
            int menuChoice = input.nextInt();
            input.nextLine();
            if (menuChoice == 1) {
                pet.play();
                System.out.println("Energy: " + pet.getEnergy());
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
                pet.feed(selectedFood);

                System.out.println("Energy: " + pet.getEnergy());
            } else if (menuChoice == 3) {
                System.out.println("Sorry, this function is not available yet.");
            } else if (menuChoice == 4) {
                System.out.println("See you next time!");
                break;
            }
        }


    }

}
