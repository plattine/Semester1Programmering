package Lesson10Abstraction.FruitTrackingSystem;

class Pear extends Fruit {

    public Pear(double weight) {
        super("Pear", weight, 570);
    }

    @Override
    public String describeTaste() {
        return "Pears are juicy and sweet.";
    }

    @Override
    public double calculateCalories() {
        return getWeight() * getCaloriesPerKg();
    }
}
