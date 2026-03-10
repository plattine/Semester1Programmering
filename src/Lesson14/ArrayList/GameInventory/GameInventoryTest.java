package Lesson14.ArrayList.GameInventory;

public class GameInventoryTest {

    public static void main(String[] args) {

        // Opret inventory objekt
        GameInventory inventory = new GameInventory();

        // Add items
        inventory.addItem("Iron Sword");
        inventory.addItem("Healing Potion");
        inventory.addItem("Magic Staff");
        inventory.addItem("Shield");

        // Print inventory
        inventory.printInventory();

        // Remove item
        inventory.removeItem("Healing Potion");
        inventory.printInventory();

        // Replace item
        inventory.replaceItem(1, "Dragon Armor"); // Magic Staff → Dragon Armor
        inventory.printInventory();

        // Check if item exists
        System.out.println("\nCheck if inventory has 'Shield': " + inventory.hasItem("Shield"));
        System.out.println("Check if inventory has 'Bow': " + inventory.hasItem("Bow"));

        // Clear inventory
        inventory.clearInventory();
        inventory.printInventory();
    }
}