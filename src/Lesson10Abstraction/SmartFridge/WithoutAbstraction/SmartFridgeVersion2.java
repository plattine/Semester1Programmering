package Lesson10Abstraction.SmartFridge.WithoutAbstraction;

import java.util.Scanner;

/*
 * ==========================================================
 * SMART FRIDGE – WITHOUT REAL ABSTRACTION
 * ==========================================================
 *
 * This version uses:
 * - instanceof
 * - Downcasting
 * - Subclass-specific logic in main class
 *
 * Problem:
 * The SmartFridge class knows TOO MUCH about subclasses.
 *
 * This violates:
 * - Open/Closed Principle
 * - Proper abstraction design
 *
 * The fridge should NOT care whether product is Butter or Milk.
 * That responsibility belongs inside the subclasses.
 * ==========================================================
 */

public class SmartFridgeVersion2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Step 1: Create fridge array
        Product[] fridge = createFridge(sc);

        // Step 2: Print fridge contents
        printFridge(fridge);

        // Step 3: Simulate days passing
        simulateDays(fridge);

        sc.close();
    }

    /*
     * Creates and fills the fridge array.
     *
     * Notice:
     * This method still contains object creation logic.
     * That is acceptable.
     */
    public static Product[] createFridge(Scanner sc) {

        Product[] fridge = new Product[3];

        for (int i = 0; i < fridge.length; i++) {

            System.out.println("Enter product type (butter/milk/vegetable/fruit):");
            String type = sc.nextLine();

            System.out.println("Enter product name:");
            String name = sc.nextLine();

            System.out.println("Enter expiry days:");
            int days = sc.nextInt();
            sc.nextLine();

            if (type.equalsIgnoreCase("butter")) {
                fridge[i] = new Butter(name, days);
            }
            else if (type.equalsIgnoreCase("milk")) {
                fridge[i] = new Milk(name, days);
            }
            else if (type.equalsIgnoreCase("vegetable")) {
                fridge[i] = new Vegetable(name, days);
            }
            else {
                fridge[i] = new Fruit(name, days);
            }
        }

        return fridge;
    }

    /*
     * Prints fridge contents.
     * This part is fine — uses polymorphism correctly.
     */
    public static void printFridge(Product[] fridge) {

        System.out.println("\n--- Fridge Contents ---");

        for (Product product : fridge) {
            System.out.println(product); // calls toString()
        }
    }

    /*
     * This is where the design problem appears.
     *
     * Why?
     * Because we check:
     * instanceof Butter
     * instanceof Milk
     * etc.
     *
     * This means:
     * SmartFridge must know ALL subclasses.
     *
     * If we add a new class (Cheese),
     * we must MODIFY this method.
     *
     * That breaks good OOP design.
     */
    public static void simulateDays(Product[] fridge) {

        for (int day = 1; day <= 3; day++) {

            System.out.println("\n--- Day " + day + " ---");

            for (Product product : fridge) {

                product.decreaseExpiry();

                if (product.isExpired()) {
                    System.out.println(product.getName() + " has expired! 🤢");
                }
                else {

                    System.out.println(product);

                    // ❌ BAD DESIGN PART
                    // Manual type checking
                    // Downcasting required
                    if (product instanceof Butter) {
                        ((Butter) product).spreadOnBread();
                    }
                    else if (product instanceof Milk) {
                        ((Milk) product).pourGlass();
                    }
                    else if (product instanceof Vegetable) {
                        ((Vegetable) product).chop();
                    }
                    else if (product instanceof Fruit) {
                        ((Fruit) product).makeJuice();
                    }
                }
            }
        }
    }
}
