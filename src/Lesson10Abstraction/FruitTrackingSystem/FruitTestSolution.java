package Lesson10Abstraction.FruitTrackingSystem;

import java.util.Scanner;

/*
 * FruitTest class
 * Demonstrates:
 * - Abstraction
 * - Inheritance
 * - Polymorphism
 * - Arrays
 * - Input validation
 */
public class FruitTestSolution {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Ask how many fruits eaten today
        int count = askForFruitCount(sc);

        // Create array of Fruit (polymorphism!)
        Fruit[] fruits = new Fruit[count];

        // Register fruits
        registerFruits(sc, fruits);

        // Print summary
        printFruitSummary(fruits);

        // Check total weight
        checkIfEnoughFruit(fruits);

        sc.close();
    }

    // Ask user for number of fruits
    public static int askForFruitCount(Scanner sc) {

        int count = 0;

        while (true) {
            System.out.print("How many fruits have you eaten today? ");

            if (sc.hasNextInt()) {
                count = sc.nextInt();
                sc.nextLine();

                if (count > 0) break;
                else System.out.println("Enter a positive number!");
            } else {
                System.out.println("Invalid number!");
                sc.nextLine();
            }
        }

        return count;
    }

    // Register fruits
    public static void registerFruits(Scanner sc, Fruit[] fruits) {

        for (int i = 0; i < fruits.length; i++) {

            System.out.print("Type (apple/pear/kiwi): ");
            String type = sc.nextLine();

            System.out.print("Weight in kg: ");
            double weight = sc.nextDouble();
            sc.nextLine();

            if (type.equalsIgnoreCase("apple")) {
                fruits[i] = new Apple(weight);
            } else if (type.equalsIgnoreCase("pear")) {
                fruits[i] = new Pear(weight);
            } else if (type.equalsIgnoreCase("kiwi")) {
                fruits[i] = new Kiwi(weight);
            } else {
                System.out.println("Unknown fruit. Defaulting to Apple.");
                fruits[i] = new Apple(weight);
            }
        }
    }

    // Print fruit summary
    public static void printFruitSummary(Fruit[] fruits) {

        System.out.println("\n--- Fruit Summary ---");

        for (int i = 0; i < fruits.length; i++) {

            System.out.println(fruits[i]);
            System.out.println(fruits[i].describeTaste());
            System.out.println("Calories: " + fruits[i].calculateCalories());
            System.out.println();
        }
    }

    // Check if user ate enough fruit
    public static void checkIfEnoughFruit(Fruit[] fruits) {

        double totalWeight = 0;

        for (int i = 0; i < fruits.length; i++) {
            totalWeight += fruits[i].getWeight();
        }

        System.out.println("Total fruit eaten: " + totalWeight + " kg");

        if (totalWeight < 0.5) {
            System.out.println("You should eat more fruit today!");
        } else {
            System.out.println("Great job! You ate enough fruit today!");
        }
    }
}
