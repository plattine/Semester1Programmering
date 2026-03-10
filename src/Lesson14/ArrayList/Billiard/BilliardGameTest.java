package Lesson14.ArrayList.Billiard;

import java.util.ArrayList;

public class BilliardGameTest {

    public static void main(String[] args) {

        // ArrayList af BilliardBall
        ArrayList<BilliardBall> ballsOnTable = new ArrayList<>();

        // Opret nogle billiard balls
        BilliardBall ball1 = new BilliardBall(1, "Solid", 1);
        BilliardBall ball2 = new BilliardBall(8, "Black", 8);
        BilliardBall ball3 = new BilliardBall(12, "Striped", 2);
        BilliardBall ball4 = new BilliardBall(7, "Solid", 7);

        // Tilføj balls til ArrayList
        ballsOnTable.add(ball1);
        ballsOnTable.add(ball2);
        ballsOnTable.add(ball3);
        ballsOnTable.add(ball4);

        System.out.println("🎱 Balls on table after adding:");
        printBalls(ballsOnTable);

        // Remove a ball (fx 12 striped)
        System.out.println("\n Removing ball number 12 (Striped)");
        ballsOnTable.remove(ball3);
        printBalls(ballsOnTable);

        // Replace a ball (fx index 1 → black ball til 9 striped)
        System.out.println("\n Replacing ball at index 1 with number 9 (Striped)");
        ballsOnTable.set(1, new BilliardBall(9, "Striped", 3));
        printBalls(ballsOnTable);

        // Check if a specific ball exists
        System.out.println("\n Checking if black 8 ball is still on table:");
        System.out.println(ballsOnTable.contains(ball2) ? "✅ Yes" : "❌ No");

        // Total points
        System.out.println("\n Total points on table: " + totalPoints(ballsOnTable));

        // Clear table
        System.out.println("\n Clearing table...");
        ballsOnTable.clear();
        System.out.println("Balls on table: " + ballsOnTable.size());
    }

    // Metode til at print alle balls
    public static void printBalls(ArrayList<BilliardBall> list) {
        for (int i = 0; i < list.size(); i++) {
            System.out.println((i + 1) + ". " + list.get(i));
        }
    }

    // Metode til at beregne total points
    public static int totalPoints(ArrayList<BilliardBall> list) {
        int total = 0;
        for (BilliardBall b : list) {
            total += b.getPointValue();
        }
        return total;
    }
}