package Lesson10Abstraction.FruitTrackingSystem;

/*
 * Abstract superclass Fruit
 * Demonstrates abstraction and encapsulation.
 *
 * We cannot create a Fruit directly because it is abstract.
 * Only subclasses like Apple, Pear, Kiwi can be instantiated.
 */
abstract class Fruit {

    // Private attributes (encapsulation)
    private String name;
    private double weight; // weight in kg
    private int caloriesPerKg;

    // Constructor
    public Fruit(String name, double weight, int caloriesPerKg) {
        this.name = name;
        this.weight = weight;
        this.caloriesPerKg = caloriesPerKg;
    }

    // Getters
    public String getName() {
        return name;
    }

    public double getWeight() {
        return weight;
    }

    public int getCaloriesPerKg() {
        return caloriesPerKg;
    }

    // Setters
    public void setName(String name) {
        this.name = name;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void setCaloriesPerKg(int caloriesPerKg) {
        this.caloriesPerKg = caloriesPerKg;
    }

    /*
     * Abstract method 1
     * Each fruit must describe its taste
     */
    public abstract String describeTaste();

    /*
     * Abstract method 2
     * Each fruit calculates its total calories
     */
    public abstract double calculateCalories();

    // toString method
    @Override
    public String toString() {
        return "Fruit: " + name +
                ", Weight: " + weight + " kg" +
                ", Calories per kg: " + caloriesPerKg;
    }
}
