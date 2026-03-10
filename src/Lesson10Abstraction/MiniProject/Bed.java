package Lesson10Abstraction.MiniProject;

class Bed extends Furniture {

    private String size;

    public Bed(String name, double price, String material, String size) {
        super(name, price, material);
        this.size = size;
    }


    @Override
    public String getDescription() {
        return "Bed size: " + size;
    }

    @Override
    public double calculateShippingCost() {
        return getPrice() * 0.12;
    }

    @Override
    public String toString() {
        return "Bed -> " + super.toString() +
                ", Size: " + size;
    }
}
