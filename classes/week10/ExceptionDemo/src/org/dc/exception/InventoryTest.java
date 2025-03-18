package org.dc.exception;

public class InventoryTest {
    public static void main(String[] args) {
        Inventory inventory = new Inventory();

//        Test adding items
        try {
            inventory.addItem("Laptop", 100);
            inventory.addItem("Laptop", 100);
            inventory.addItem(null, 0);
        } catch (InvalidItemException e) {
            System.out.println("Cannot add an null item");
        }

//        Test Removing items
        try {
            inventory.removeItem("TapLop", 100);
        } catch (OutOfStockException e) {
            System.out.println("The item is out of stock.");
        }

//        Trigger a system failure
        try {
            inventory.triggerSystemFailure();
        } catch (InventorySystemError e) {
            System.out.println(e.getMessage());
        }
    }
}
