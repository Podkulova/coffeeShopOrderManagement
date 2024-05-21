package exercise;

public class ItemFactory {
    public Item createItem(String name, double price, String itemType) {
            if (itemType.equalsIgnoreCase("Drink")) {
                return new Drink(name, price);
            } else if (itemType.equalsIgnoreCase("Food")) {
                return new Food(name, price);
            }
            throw new IllegalArgumentException("Unknown item type: " + itemType);
        }
}
