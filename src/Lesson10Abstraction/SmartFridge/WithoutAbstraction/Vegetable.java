package Lesson10Abstraction.SmartFridge.WithoutAbstraction;

public class Vegetable extends Product {

    public Vegetable(String name, int expiryDays) {
        super(name, expiryDays);
    }

    public void chop() {
        System.out.println(getName() + " is being chopped 🔪");
    }

    @Override
    public String toString() {
        return "Vegetable 🥕 | " + super.toString();
    }
}

