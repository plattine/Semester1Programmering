package Lesson10Abstraction.MiniProject;

/*
 * Abstract superclass Furniture
 * Demonstrates abstraction and encapsulation.
 */
abstract class Furniture {

    // Private attributes (encapsulation)
    private String name;
    private double price;
    private String material;


    // Constructor
    public Furniture(String name, double price, String material) {
        this.name = name;
        this.price = price;
        this.material = material;
    }

    // Getters
    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public String getMaterial() {
        return material;
    }

    // Setters
    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    // Abstract methods (must be implemented in subclasses)
    public abstract String getDescription();

    public abstract double calculateShippingCost();

    // toString method
    @Override
    public String toString() {
        return "Name: " + name +
                ", Price: " + price +
                ", Material: " + material;
    }
}
