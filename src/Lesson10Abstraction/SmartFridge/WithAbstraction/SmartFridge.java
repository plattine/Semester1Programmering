package Lesson10Abstraction.SmartFridge.WithAbstraction;

import java.util.Scanner;

public class SmartFridge {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
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

        System.out.println("\n--- Fridge Contents ---");
        for (Product product : fridge) {
            System.out.println(product);
        }

        // Simulate 3 days
        for (int day = 1; day <= 3; day++) {

            System.out.println("\n--- Day " + day + " ---");

            for (Product product : fridge) {

                product.decreaseExpiry();

                if (product.isExpired()) {
                    System.out.println(product.getName() + " has expired! 🤢");
                } else {
                    System.out.println(product);
                    product.useProduct();  // POLYMORPHISM 🔥
                }
            }
        }

        sc.close();
    }
}
