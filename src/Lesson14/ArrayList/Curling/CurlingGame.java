package Lesson14.ArrayList.Curling;

import java.util.ArrayList;

public class CurlingGame {

    public static void main(String[] args) {
        ArrayList<CurlingStone> stones = new ArrayList<>();

        // Simulér sten på isen
        stones.add(new CurlingStone("Red", 5));
        stones.add(new CurlingStone("Blue", 12));
        stones.add(new CurlingStone("Red", 18));
        stones.add(new CurlingStone("Blue", 7));
        stones.add(new CurlingStone("Red", 10));

        System.out.println("🥌 Stones on the ice:");
        printStones(stones);

        // Beregn point realistisk
        int redPoints = calculatePoints(stones, "Red");
        int bluePoints = calculatePoints(stones, "Blue");

        System.out.println("\n Score:");
        System.out.println("Red: " + redPoints + " points");
        System.out.println("Blue: " + bluePoints + " points");

        // Fjern en stone (fx fordi den er udenfor scoring zone)
        System.out.println("\n Removing stone outside scoring zone (distance > 20)");
        removeDistantStones(stones, 20);
        printStones(stones);

        // Tilføj ny stone (fx ny kast)
        System.out.println("\n Adding new stone for Blue at 4cm");
        stones.add(new CurlingStone("Blue", 4));
        printStones(stones);

        // Tjek om der er en stone tæt på centrum
        System.out.println("\n Checking if Red has stone within 5cm of center:");
        System.out.println(hasStoneWithinDistance(stones, "Red", 5) ? "✅ Yes" : "❌ No");

        // Clear stones (slut spil)
        System.out.println("\n🧹 Clearing all stones...");
        stones.clear();
        System.out.println("Stones on ice: " + stones.size());
    }

    // Print alle stones
    public static void printStones(ArrayList<CurlingStone> list) {
        for (int i = 0; i < list.size(); i++) {
            System.out.println((i + 1) + ". " + list.get(i));
        }
    }

    // Beregn points realistisk: kun stones tættere på centrum end modstanderens nærmeste sten tæller
    public static int calculatePoints(ArrayList<CurlingStone> stones, String team) {
        int teamPoints = 0;

        // Find nærmeste stone for modstander
        int opponentClosest = Integer.MAX_VALUE;
        for (CurlingStone s : stones) {
            if (!s.getTeam().equals(team)) {
                opponentClosest = Math.min(opponentClosest, s.getDistanceToCenter());
            }
        }

        // Tæl kun stones tættere end modstanderens nærmeste stone
        for (CurlingStone s : stones) {
            if (s.getTeam().equals(team) && s.getDistanceToCenter() < opponentClosest) {
                teamPoints++;
            }
        }

        return teamPoints;
    }

    // Fjern stones længere væk end maxDistance
    public static void removeDistantStones(ArrayList<CurlingStone> stones, int maxDistance) {
        stones.removeIf(s -> s.getDistanceToCenter() > maxDistance);
    }

    // Tjek om team har stone inden for distance
    public static boolean hasStoneWithinDistance(ArrayList<CurlingStone> stones, String team, int maxDistance) {
        for (CurlingStone s : stones) {
            if (s.getTeam().equals(team) && s.getDistanceToCenter() <= maxDistance) {
                return true;
            }
        }
        return false;
    }
}