package exercise;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class OrderTest {
    private Order order;
    private Item drink;
    private Item food;

    @BeforeEach
    public void setUp() {
        order = new Order();
        drink = new Drink("Sprite", 45);
        food = new Food("Lasagne", 150);
    }

    @Test
    public void testAddItem() {
        order.adding(drink);

        assertTrue(order.getItemList().contains(drink));
    }

    @Test
    public void testRemoveItems() {
        order.adding(drink);
        order.removing(drink);

        assertFalse(order.getItemList().contains(drink));
    }

    @Test
    public void testCalculateTotalprice() {
        order.adding(drink);
        order.adding(food);

        assertEquals(195, order.calculateTotalprice());
    }

    @Test
    public void testItemList() {
        order.adding(drink);
        order.adding(food);

        List<Item> items = order.getItemList();

        assertEquals(2, items.size());
        assertTrue(items.contains(drink));
        assertTrue(items.contains(food));
    }
}