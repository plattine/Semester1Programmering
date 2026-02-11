package Lesson07;

public class Flower {
    private String name;
    private String family;
    private String color;
    private int quantity;
    private double price;

    public Flower(String name, String family, String color, int quantity, double price) {
        this.name = name;
        this.family = family;
        this.color = color;
        this.quantity = quantity;
        this.price = price;
    }

    //Getters
    public String getName() {
        return name;
    }

    public String getFamily() {
        return family;
    }

    public String getColor() {
        return color;
    }

    public int getQuantity() {
        return quantity;
    }

    public double getPrice() {
        return price;
    }

    //Setters
    public void setName(String name) {
        this.name = name;
    }

    public void setFamily(String family) {
        this.family = family;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String toString() {
        return "Name of the flower: " + name +
                "\nFamily: " + family +
                "\nColor: " + color +
                "\nQuantity " + quantity +
                "\nPrice " + price + "DKK\n";
    }

}
