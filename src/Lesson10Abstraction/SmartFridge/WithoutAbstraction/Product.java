package Lesson10Abstraction.SmartFridge.WithoutAbstraction;

public class Product {

    private String name;
    private int expiryDays;

    // Constructor
    public Product(String name, int expiryDays) {
        this.name = name;
        this.expiryDays = expiryDays;
    }

    // Getters
    public String getName() {
        return name;
    }

    public int getExpiryDays() {
        return expiryDays;
    }

    // Setters
    public void setName(String name) {
        this.name = name;
    }

    public void setExpiryDays(int expiryDays) {
        this.expiryDays = expiryDays;
    }

    public void decreaseExpiry() {
        expiryDays--;
    }

    public boolean isExpired() {
        return expiryDays <= 0;
    }

    @Override
    public String toString() {
        return "Product: " + name + " | Days left: " + expiryDays;
    }
}
