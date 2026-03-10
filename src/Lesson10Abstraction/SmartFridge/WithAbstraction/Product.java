package Lesson10Abstraction.SmartFridge.WithAbstraction;

public abstract class Product {

    private String name;
    private int expiryDays;

    // Constructor
    public Product(String name, int expiryDays) {
        this.name = name;
        this.expiryDays = expiryDays;
    }

    // Getter
    public String getName() {
        return name;
    }

    public int getExpiryDays() {
        return expiryDays;
    }

    // Setter
    public void setName(String name) {
        this.name = name;
    }

    public void setExpiryDays(int expiryDays) {
        this.expiryDays = expiryDays;
    }

    // Logic methods
    public void decreaseExpiry() {
        expiryDays--;
    }

    public boolean isExpired() {
        return expiryDays <= 0;
    }

    // Polymorphic method (VERY important)
    public abstract void useProduct();

    @Override
    public String toString() {
        return "Product: " + name + " | Days left: " + expiryDays;
    }
}
