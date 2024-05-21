package exercise;
public class Main {
    public static void main(String[] args) {
        ItemFactory itemFactory = new ItemFactory();


        Item drink = itemFactory.createItem("Sprite", 45, "Drink");
        Item food = itemFactory.createItem("Lasagne", 150, "Food");

        System.out.println(drink.getType() + ": " + drink.getName() + " " + drink.getPrice() + " Kč.");
        System.out.println(food.getType() + ": " + food.getName() + " " + food.getPrice() + " Kč.");

        Order order = new Order();
        order.adding(drink);
        order.adding(food);

        System.out.println("Total price: " + order.calculateTotalprice() + " Kč.");


    }
}
