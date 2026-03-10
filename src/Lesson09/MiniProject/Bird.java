package Lesson09.MiniProject;

/*
 * Subclass: Cat
 */
public class Bird extends Pet {
    private double wingSpan;

    public Bird(String name, double wingSpan) {
        super(name);
        this.wingSpan = wingSpan;
    }

    public double getWingSpan() {
        return wingSpan;
    }

    @Override
    public String toString() {
        return "Bird: " + getName() + " (chip, chip!)" + wingSpan + "m";
    }
}
