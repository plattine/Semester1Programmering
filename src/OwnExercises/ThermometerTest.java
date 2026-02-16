package OwnExercises;

public class ThermometerTest {

    public static void main(String[] args) {
        Thermometer t = new Thermometer(-300);

        t.increase();
        t.increase();
        t.increase();

        t.decrease();

        int currentTemp = t.getTemperature();

        System.out.println(currentTemp);
    }
}
