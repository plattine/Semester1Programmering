package Lesson08.BattleShip.Version2;

import java.util.Random;

public class BattleshipGame {
    public static void main(String[] args) {
        Random random = new Random();
        GameHelper helper = new GameHelper();
        Ship enemyShip = new Ship();

        // Placer skibet (3 felter langt) et sted på linjen 0–6
        int start = random.nextInt(5); // sikrer at skibet passer ind
        int[] shipLocation = { start, start + 1, start + 2 };
        enemyShip.setLocation(shipLocation);

        System.out.println("=== Welcome, Captain! ===");
        System.out.println("Enemy ship is hiding on positions 0–6.");
        System.out.println("Sink it by hitting all 3 cells!");

        int numGuesses = 0;
        boolean isAlive = true;

        // Spil-loop
        while (isAlive) {
            int guess = helper.getUserInput("Enter your shot (0-6):");
            numGuesses++;

            String result = enemyShip.checkHit(guess);
            System.out.println(result);

            if (enemyShip.isSunk()) {
                System.out.println("Victory! You sank the enemy ship in " + numGuesses + " shots!");
                isAlive = false;
            }
        }
    }
}