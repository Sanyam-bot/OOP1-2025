package org.dc.exception;

import java.util.HashMap;
import java.util.Map;

public class Inventory {

    public Inventory() {} // Default Constructor

    private Map<String, Integer> stock = new HashMap<>();

//    Add items to inventory
    public void addItem(String item, int quantity) throws InvalidItemException{
        if (item == null || item.isEmpty()) {
            throw new InvalidItemException("Item name cannot be empty or null.");
        }
        stock.put(item, quantity);
    }

//    Remove items from inventory
    public void removeItem(String item, int quantity) throws OutOfStockException {
        if (!stock.containsKey(item)) {
            throw new OutOfStockException("Item " + item + " is not in stock.");
        }
        int currentStock = stock.get(item);
        if (currentStock < quantity) {
            throw new OutOfStockException("Not enough stock for " + item);
        }
        stock.put(item, (quantity - currentStock));
    }

//    Simulate a critical failure
    public void triggerSystemFailure() throws InventorySystemError{
        throw new InventorySystemError("Critical System failure detected.");
    }
}