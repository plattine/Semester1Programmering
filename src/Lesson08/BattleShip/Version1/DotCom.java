package Lesson08.BattleShip.Version1;


public class DotCom {
    // holds the ship's cells (e.g., [2,3,4])
    private int[] locationCells;
    private int numOfHits = 0;

    public void setLocationCells(int[] locs) {
        // store a copy to avoid outside changes
        locationCells = new int[locs.length];
        for (int i = 0; i < locs.length; i++) {
            locationCells[i] = locs[i];
        }
    }

    // returns "hit", "miss", or "kill"
    public String checkYourself(String userInput) {
        int guess;
        try {
            guess = Integer.parseInt(userInput);
        } catch (NumberFormatException e) {
            return "miss"; // invalid input counts as miss (keep it simple)
        }

        // scan the array for a hit; mark a hit by setting that cell to -1
        for (int i = 0; i < locationCells.length; i++) {
            if (locationCells[i] == guess) {
                locationCells[i] = -1;
                numOfHits++;
                if (numOfHits == locationCells.length) {
                    return "kill";
                }
                return "hit";
            }
        }
        return "miss";
    }
}
