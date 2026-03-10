package Lesson08.BattleShip.Version1;

import java.util.Random;
import java.util.Scanner;

public class GameLauncher {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Random rand = new Random();

        // Create and place a single DotCom of length 3 on a 1D grid [0..6]
        DotCom dot = new DotCom();
        int gridSize = 7;
        int shipSize = 3;

        // pick a start so the ship fits (start can be 0..4 for size 3)
        int start = rand.nextInt(gridSize - shipSize + 1);
        int[] locations = new int[shipSize];
        for (int i = 0; i < shipSize; i++) {
            locations[i] = start + i;
        }
        dot.setLocationCells(locations);

        System.out.println("🎯 Sink a Dot Com!");
        System.out.println("Grid positions are 0 to 6. Try to sink the 3-cell ship.");

        int numGuesses = 0;
        boolean isAlive = true;

        while (isAlive) {
            System.out.print("Enter a guess (0-6): ");
            String input = in.nextLine().trim();
            numGuesses++;

            String result = dot.checkYourself(input);
            System.out.println(result.toUpperCase());

            if ("kill".equals(result)) {
                System.out.println("You took " + numGuesses + " guesses. GG! 🚢💥");
                isAlive = false;
            }
        }

        in.close();
    }
}
