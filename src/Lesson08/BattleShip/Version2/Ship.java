package Lesson08.BattleShip.Version2;


public class Ship {
    private int[] location; // skibets positioner
    private int hits;       // hvor mange gange skibet er blevet ramt

    // Sætter skibets placering
    public void setLocation(int[] loc) {
        this.location = loc;
        this.hits = 0;
    }

    // Tjekker et skud
    public String checkHit(int guess) {
        for (int pos : location) {   // loop gennem alle skibets celler
            if (guess == pos) {      // spillerens gæt matcher en position
                hits++;
                if (hits == location.length) {
                    return "Hit! You sank my battleship!";
                } else {
                    return "Hit!";
                }
            }
        }
        return "Miss!"; // gættet var ikke i skibets positioner
    }

    public boolean isSunk() {
        return hits == location.length;
    }
}
