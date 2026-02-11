package Lesson07;

import java.util.Scanner;

public class FlowerShop {
    public static void main(String[] args) {
        //Creating Array
        Flower[] flowers = new Flower[3];

        //Scanner
        Scanner input = new Scanner(System.in);
        System.out.println("Name of the flower: ");
        String newFlowerName = input.nextLine();
        System.out.println("Family: ");
        String newFlowerFamily = input.nextLine();
        System.out.println("Color: ");
        String newFlowerColor = input.nextLine();
        System.out.println("Quantity: ");
        int newFlowerQuantity = input.nextInt();
        System.out.println("Price: ");
        double newFlowerPrice = input.nextDouble();




        flowers[0] = new Flower("Rose", "Rosaceae", "red", 10, 95.50);
        flowers[1] = new Flower("Sunflower", "Asteracea", "yellow", 1, 15.00);
        flowers[2] = new Flower("Lily", "Liliaceae", "bright", 5, 40.90);


        double total = 0;
        for (Flower f : flowers) {
            double price = f.getPrice();
            total = total + price;
            System.out.println(f);
        }
        System.out.println("Total price " + total + "DKK");



    }
}
