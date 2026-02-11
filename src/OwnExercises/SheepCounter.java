package OwnExercises;

public class SheepCounter {
    private int sheep;
    private int maxSheep = 50;


    public SheepCounter(int sheep) {
        this.sheep = sheep;
    }

    public void countSheep() {
        int i = 3;
        if (sheep > maxSheep) {
            System.out.println("Too many sheeps");
        } else if (sheep < maxSheep) {
            while (i <= sheep) {
                i++;
                if (i % 2 == 0) {
                    System.out.println("Sheep number " + i + " 🐑");
                }
            }

            System.out.println("You fall asleep... 😴");

        }
    }
}
