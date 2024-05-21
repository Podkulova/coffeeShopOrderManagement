package exercise;

import java.util.ArrayList;
import java.util.List;

/*
Třída reprezentující objednávku.
Obsahuje seznam položek, metody pro přidávání a odstraňování položek a výpočet celkové ceny.
 */
public class Order {
    private List<Item> itemList;

    public Order() {
        this.itemList = new ArrayList<>();
    }

    public Order(List<Item> itemList) {
        this.itemList = new ArrayList<>();
    }

    public void adding(Item item) {
        if (item != null) {
            itemList.add(item);
        }
    }

    public void removing(Item item) {
        if (item != null) {
            itemList.remove(item);
        }
    }

    public double calculateTotalprice() {
        double totalPrice = 0;

        for (Item item : itemList) {
            totalPrice += item.getPrice();
        }
        return totalPrice;
    }

    public List<Item> getItemList() {
        return new ArrayList<>(itemList);
    }
}















