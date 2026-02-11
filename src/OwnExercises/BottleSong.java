package OwnExercises;

public class BottleSong {
    // private variable
    private int bottle;

    // constructor
    public BottleSong(int bottle) {
        this.bottle = bottle;
    }

    //method
    public void BottleCounter() {
        //int bottle = 3;

        while (bottle > 0) {
            System.out.println(bottle + " bottles of soda on the wall, " + bottle + " bottles of soda!");
            bottle--;
            System.out.println("Take one down, pass it around, " + bottle + " bottles of soda on the wall.\n");
            if (bottle == 0) {
                System.out.println("No more bottles of soda on the wall! 🍾");
            }

        }


    }

}
