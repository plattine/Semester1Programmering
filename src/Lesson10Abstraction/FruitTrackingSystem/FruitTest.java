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
public class FruitTest {

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

        /*
         * ==========================================================
         * TASK: Calculate Total Fruit Weight
         * ==========================================================
         *
         * Your goal:
         * Write code that calculates the total weight of all fruits
         * stored in the array.
         *
         * Then:
         * - Print the total weight
         * - Check if it is less than 0.5 kg
         * - Print a health message based on the result
         *
         * IMPORTANT CONCEPTS USED:
         * - Arrays
         * - for-loop
         * - Accumulator variable
         * - Getters (encapsulation)
         * - if-else statement
         *
         * Think about what each step does.
         * ==========================================================
         */



            /*
             * STEP 1:
             * Create a variable that can store the total weight.
             *
             * HINT:
             * - The weight is a decimal number.
             * - Therefore you must use double.
             *
             * This variable is called an "accumulator".
             * It collects values inside a loop.
             */

            double totalWeight = 0;  // Students: keep this line


            /*
             * STEP 2:
             * Loop through the entire fruits array.
             *
             * You must:
             * - Start from index 0
             * - Continue until fruits.length
             *
             * Inside the loop:
             * - Access each fruit object
             * - Call getWeight()
             * - Add it to totalWeight
             *
             * IMPORTANT:
             * You MUST use the getter method.
             * Do NOT access attributes directly.
             *
             * Why?
             * Because of encapsulation.
             */

            // TODO: Write a for loop here


            /*
             * STEP 3:
             * After the loop is finished,
             * print the total weight.
             *
             * Example output:
             * Total fruit eaten: 0.73 kg
             */

            // TODO: Print totalWeight


            /*
             * STEP 4:
             * Use an if-else statement.
             *
             * If totalWeight is less than 0.5:
             * → Print: "You should eat more fruit today!"
             *
             * Otherwise:
             * → Print: "Great job! You ate enough fruit today!"
             *
             * This is simple decision logic.
             *
             * Think carefully about:
             * - Comparison operator
             * - Correct condition
             */

            // TODO: Write if-else condition


            /*
             * THINKING QUESTION:
             *
             * Why do we calculate AFTER the loop,
             * and not inside the loop?
             *
             * Because we need the FINAL total value.
             */

    }
}
