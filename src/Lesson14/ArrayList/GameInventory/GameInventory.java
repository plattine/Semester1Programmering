package Lesson14.ArrayList.GameInventory;

import java.util.ArrayList;

public class GameInventory {

    // Encapsulation: private attributes
    private ArrayList<String> items;

    // Constructor → opret tom inventory
    public GameInventory() {
        items = new ArrayList<>();
    }

    // Tilføj item
    public void addItem(String item) {
        items.add(item);
        System.out.println("🟢 Added: " + item);
    }

    // Fjern item
    public void removeItem(String item) {
        if (items.remove(item)) {
            System.out.println("🔴 Removed: " + item);
        } else {
            System.out.println("⚠️ Item not found: " + item);
        }
    }

    // Ændre/erstat item
    public void replaceItem(int index, String newItem) {
        if (index >= 0 && index < items.size()) {
            String oldItem = items.set(index, newItem);
            System.out.println("🟡 Replaced: " + oldItem + " with " + newItem);
        } else {
            System.out.println("⚠️ Invalid index: " + index);
        }
    }

    // Tjek om item findes
    public boolean hasItem(String item) {
        return items.contains(item);
    }

    // Print alle items
    public void printInventory() {
        System.out.println("\n Inventory (" + items.size() + " items):");
        for (int i = 0; i < items.size(); i++) {
            System.out.println((i + 1) + ". " + items.get(i));
        }
    }

    // Clear inventory
    public void clearInventory() {
        items.clear();
        System.out.println(" Inventory cleared!");
    }
}