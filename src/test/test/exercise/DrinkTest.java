package exercise;

import exercise.Drink;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class DrinkTest {

    @Test
    public void testDrinkCreation() {

        Drink drink = new Drink("Cola", 45);

        assertEquals("Cola", drink.getName());
        assertEquals(45, drink.getPrice());
        assertEquals("Drink", drink.getType());
    }
}