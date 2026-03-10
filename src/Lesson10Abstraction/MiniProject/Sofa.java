package Lesson10Abstraction.MiniProject;

class Sofa extends Furniture {

    private int seats;

    public Sofa(String name, double price, String material, int seats) {
        super(name, price, material);
        this.seats = seats;
    }


    @Override
    public String getDescription() {
        return "Sofa with " + seats + " seats";
    }

    @Override
    public double calculateShippingCost() {
        return getPrice() * 0.10;
    }

    @Override
    public String toString() {
        return "Sofa -> " + super.toString() +
                ", Seats: " + seats;
    }
}
