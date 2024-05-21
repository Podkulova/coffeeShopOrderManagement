package exercise;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ItemFactoryTest {

    private ItemFactory itemFactory = new ItemFactory();

    @Test
    public void testCreateDrink() {

        Item drink = itemFactory.createItem("Sprite", 45, "Drink");

        assertNotNull(drink);
        assertEquals("Sprite", drink.getName());
        assertEquals(45, drink.getPrice());
        assertEquals("Drink", drink.getType());
    }

    @Test
    public void testCreateFood() {

        Item food = itemFactory.createItem("Lasagne", 150, "Food");

        assertNotNull(food);
        assertEquals("Lasagne", food.getName());
        assertEquals(150, food.getPrice());
        assertEquals("Food", food.getType());
    }

    @Test
    public void testCreateUnknownItemType() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            itemFactory.createItem("Unknown", 100, "UnknownType");
        });
        assertEquals("Unknown item type: UnknownType", exception.getMessage());
    }
}