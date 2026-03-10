package Lesson10Abstraction.FruitTrackingSystem;

import java.util.Scanner;

/*
 * ==========================================================
 *  FruitTest CLASS – STUDENT VERSION
 * ==========================================================
 *
 *  Your task:
 *  Complete this program step by step.
 *
 *  Think before coding!
 * ==========================================================
 */

public class FruitTestWithComment {

    public static void main(String[] args) {

        /*
         * Step 1:
         * Create a Scanner object.
         * Why?
         * Because we need user input.
         */

        Scanner sc = null; // TODO: initialize Scanner properly


        /*
         * Step 2:
         * Ask the user:
         * "How many fruits have you eaten today?"
         *
         * This must NOT be written directly here.
         * Call a separate method instead.
         *
         * Why?
         * Because good programs divide logic into small methods.
         */

        int count = 0; // TODO: call askForFruitCount method


        /*
         * Step 3:
         * Create an array of type Fruit.
         *
         * IMPORTANT:
         * The array type must be Fruit (the abstract class).
         *
         * Why?
         * Because this demonstrates POLYMORPHISM.
         *
         * A Fruit array can store:
         * - Apple objects
         * - Pear objects
         * - Kiwi objects
         */

        Fruit[] fruits = null; // TODO: create the array using count


        /*
         * Step 4:
         * Register fruits (ask user for type + weight).
         *
         * Do NOT write the logic here.
         * Call a separate method:
         *
         * registerFruits(...)
         */

        // TODO: call registerFruits


        /*
         * Step 5:
         * Print a summary of all fruits.
         *
         * This must include:
         * - toString()
         * - describeTaste()
         * - calculateCalories()
         *
         * Why?
         * Because these methods come from abstraction + inheritance.
         */

        // TODO: call printFruitSummary


        /*
         * Step 6:
         * Check if user ate at least 0.5 kg fruit.
         *
         * If less → print "Eat more fruit!"
         * If 0.5 or more → print positive message.
         */

        // TODO: call checkIfEnoughFruit


        /*
         * Step 7:
         * Always close Scanner at the end.
         */

        // TODO: close scanner
    }


    /*
     * ==========================================================
     * METHOD 1 – ASK FOR FRUIT COUNT
     * ==========================================================
     *
     * This method must:
     * - Ask the user how many fruits they ate
     * - Validate input
     * - Ensure number is positive
     *
     * Validation requirements:
     * - If user enters text → show error
     * - If number is <= 0 → show error
     *
     * Use:
     * - while(true)
     * - hasNextInt()
     *
     * Why validation?
     * Because real programs must handle bad input safely.
     */

    public static int askForFruitCount(Scanner sc) {

        int count = 0;

        // TODO:
        // Implement input validation loop here

        return count; // replace with correct value
    }


    /*
     * ==========================================================
     * METHOD 2 – REGISTER FRUITS
     * ==========================================================
     *
     * This method must:
     * - Loop through the Fruit array
     * - Ask for fruit type (apple / pear / kiwi)
     * - Ask for weight in kg
     *
     * IMPORTANT:
     * Use equalsIgnoreCase() when checking fruit type.
     *
     * Why?
     * Because user might type:
     * Apple
     * APPLE
     * apple
     *
     * You must create the correct object:
     *
     * If apple → new Apple(weight)
     * If pear → new Pear(weight)
     * If kiwi → new Kiwi(weight)
     *
     * If unknown type:
     * You may:
     * - Print error
     * - Or default to Apple
     *
     * This method demonstrates:
     * POLYMORPHISM
     * because the array type is Fruit.
     */

    public static void registerFruits(Scanner sc, Fruit[] fruits) {

        // TODO:
        // Write a for loop
        // Ask for type
        // Ask for weight
        // Create correct subclass object
        // Store it in the array
    }


    /*
     * ==========================================================
     * METHOD 3 – PRINT SUMMARY
     * ==========================================================
     *
     * This method must:
     * - Loop through the array
     * - Print each fruit
     *
     * For each fruit:
     * - Print toString()
     * - Print describeTaste()
     * - Print calculateCalories()
     *
     * Important:
     * We do NOT check if object is Apple or Pear.
     *
     * Why?
     * Because polymorphism handles that automatically.
     */

    public static void printFruitSummary(Fruit[] fruits) {

        // TODO:
        // Loop through array
        // Print information
    }


    /*
     * ==========================================================
     * METHOD 4 – CHECK TOTAL WEIGHT
     * ==========================================================
     *
     * This method must:
     * - Calculate total weight
     * - Use getWeight() from Fruit
     * - Compare total weight with 0.5 kg
     *
     * If less than 0.5:
     * → "You should eat more fruit today!"
     *
     * Else:
     * → "Great job! You ate enough fruit!"
     *
     * This method demonstrates:
     * - Using getters (encapsulation)
     * - Looping through arrays
     */

    public static void checkIfEnoughFruit(Fruit[] fruits) {

        double totalWeight = 0;

        // TODO:
        // Loop through array
        // Add weights together
        // Print result
        // Use if-statement
    }
}