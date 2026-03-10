package Lesson10Abstraction.SmartFridge.WithAbstraction;

public class Vegetable extends Product {

    public Vegetable(String name, int expiryDays) {
        super(name, expiryDays);
    }

    public void chop() {
        System.out.println(getName() + " is being chopped 🔪");
    }

    @Override
    public void useProduct() {
        chop();
    }

    @Override
    public String toString() {
        return "Vegetable 🥕 | " + super.toString();
    }
}
