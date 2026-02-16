package OwnExercises;

public class Thermometer {

    private int valueCelsius;

    public Thermometer(int value) {
        this.valueCelsius = value;
        if (value < -273) {
            valueCelsius = -273;
        }
    }

    public int increase() {
        valueCelsius++;
        return valueCelsius;
    }


    public int decrease() {
        if (valueCelsius > -273) {
            valueCelsius--;

        }return valueCelsius;


    }

    public int getTemperature() {
        return valueCelsius;
    }
}
