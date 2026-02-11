package OwnExercises;

public class SheepCounterBack {
    private int sheep;
    private int maxSheep = 50;


    public SheepCounterBack(int sheep) {
        this.sheep = sheep;
    }

    public void countSheep() {
        //int i = sheep;
        if (sheep > maxSheep) {
            System.out.println("Too many sheeps");
        } else if (sheep < maxSheep) {
            while (sheep > 0) {
                sheep--;
                if (sheep % 2 == 0) {
                    System.out.println("Sheep number " + sheep + " 🐑");
                }
            }

            System.out.println("You fall asleep... 😴");

        }
    }
}

