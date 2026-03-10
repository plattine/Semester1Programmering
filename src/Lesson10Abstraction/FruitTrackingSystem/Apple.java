package Lesson10Abstraction.FruitTrackingSystem;

class Apple extends Fruit {

    public Apple(double weight) {
        super("Apple", weight, 520);
    }

    @Override
    public String describeTaste() {
        return "Apples are sweet and slightly sour.";
    }

    @Override
    public double calculateCalories() {
        return getWeight() * getCaloriesPerKg();
    }
}
