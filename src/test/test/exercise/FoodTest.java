package exercise;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class FoodTest {

    @Test
    public void testFoodCreation() {

        Food food = new Food("Zelňačka", 50);

        assertEquals("Zelňačka", food.getName());
        assertEquals(50, food.getPrice());
        assertEquals("Food", food.getType());
    }

}