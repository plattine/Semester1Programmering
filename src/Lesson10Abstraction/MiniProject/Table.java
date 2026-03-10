package Lesson10Abstraction.MiniProject;

class Table extends Furniture {

    private int numberOfLegs;

    public Table(String name, double price, String material, int numberOfLegs) {
        super(name, price, material);
        this.numberOfLegs = numberOfLegs;
    }


    @Override
    public String getDescription() {
        return "Table with " + numberOfLegs + " legs";
    }

    @Override
    public double calculateShippingCost() {
        return getPrice() * 0.08;
    }

    @Override
    public String toString() {
        return "Table -> " + super.toString() +
                ", Legs: " + numberOfLegs;
    }
}
