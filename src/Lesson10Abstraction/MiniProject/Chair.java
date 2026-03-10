package Lesson10Abstraction.MiniProject;

class Chair extends Furniture {

    private boolean hasArmRest;

    public Chair(String name, double price, String material, boolean hasArmRest) {
        super(name, price, material);
        this.hasArmRest = hasArmRest;
    }


    @Override
    public String getDescription() {
        return "Chair with armrest: " + hasArmRest;
    }

    @Override
    public double calculateShippingCost() {
        return getPrice() * 0.05;
    }

    @Override
    public String toString() {
        return "Chair -> " + super.toString() +
                ", Armrest: " + hasArmRest;
    }
}
