package Lesson14.ArrayListOgErrorHandling;

//Test Garage
public class TestGarage {
    public static void main(String[] args) {
        Garage garage = new Garage();

        garage.addCar(new Car("Tesla", "Model 3", FuelType.ELECTRIC));
        garage.addCar(new Car("Toyota", "Corolla", FuelType.PETROL));

        garage.listCars();

        // Remove valid index
        garage.removeCar(1);

        // Try to remove invalid index -> triggers catch
        garage.removeCar(5);
    }
}
