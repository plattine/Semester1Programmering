package OwnExercises;

public class DalilyTemperature {

    public static void main(String[] args) {

        int[] temperature = new int[7];

        temperature[0] = 18;
        temperature[1] = 21;
        temperature[2] = 19;
        temperature[3] = 23;
        temperature[4] = 17;
        temperature[5] = 20;
        temperature[6] = 22;

        for (int i = 0; i < temperature.length; i++) {
            System.out.println("Day " + (i + 1) + ":" + temperature[i]);
        }
        int coldestDay = temperature[0];

        for (int i = 0; i < temperature.length; i++) {
            if (temperature[i] < coldestDay) {
                coldestDay = temperature[i];
            }
        }
        System.out.println("coldest = " + coldestDay);


    }

}
