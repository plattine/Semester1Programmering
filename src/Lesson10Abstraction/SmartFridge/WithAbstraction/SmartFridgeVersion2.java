package Lesson10Abstraction.SmartFridge.WithAbstraction;

import java.util.Scanner;

/*
 * ==========================================================
 * SMART FRIDGE – WITH REAL ABSTRACTION
 * ==========================================================
 *
 * This version uses:
 * - Abstract method: useProduct()
 * - Polymorphism
 * - No instanceof
 * - No downcasting
 *
 * Product class contains:
 * public abstract void useProduct();
 *
 * Each subclass implements its own behavior.
 *
 * RESULT:
 * SmartFridge does NOT need to know
 * what kind of product it is using.
 *
 * This follows:
 * - Open/Closed Principle
 * - Proper abstraction
 * - Clean design
 * ==========================================================
 */

public class SmartFridgeVersion2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Product[] fridge = createFridge(sc);

        printFridge(fridge);

        simulateDays(fridge);

        sc.close();
    }

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

            switch (type.toLowerCase()) {
                case "butter":
                    fridge[i] = new Butter(name, days);
                    break;
                case "milk":
                    fridge[i] = new Milk(name, days);
                    break;
                case "vegetable":
                    fridge[i] = new Vegetable(name, days);
                    break;
                case "fruit":
                    fridge[i] = new Fruit(name, days);
                    break;
                default:
                    System.out.println("Unknown type, defaulting to Fruit.");
                    fridge[i] = new Fruit(name, days);
            }
        }

        return fridge;
    }

    public static void printFridge(Product[] fridge) {

        System.out.println("\n--- Fridge Contents ---");

        for (Product product : fridge) {
            System.out.println(product);
        }
    }

    /*
     * THIS IS THE BIG DIFFERENCE.
     *
     * No instanceof.
     * No downcasting.
     * No subclass knowledge.
     *
     * We simply call:
     * product.useProduct();
     *
     * Java decides automatically which method to run.
     *
     * That is TRUE POLYMORPHISM.
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

                    // CLEAN POLYMORPHISM
                    product.useProduct();
                }
            }
        }
    }
}
