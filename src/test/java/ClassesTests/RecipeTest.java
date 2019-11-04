package com.culinarycompanion.culinarycompanion;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import Classes.Recipe;

public class RecipeTest {
    @Test
    public void instantiatedRecipeWorks() {
        Recipe successfulRecipe = new Recipe();
        int toasterStrudel = 9;
        successfulRecipe.setCalories(400.00);
        System.out.println("Recipes test started");

        //Test a setter and getter to ensure they work as intended
        assertEquals(successfulRecipe.getCalories(), Double.valueOf(400.00));

        //Ensure that recipes aren't somethign they're not
        assertNotSame(successfulRecipe, toasterStrudel);

        //Testing setter works with new value
        successfulRecipe.setCalories(900.00);
        assertEquals(successfulRecipe.getCalories(), Double.valueOf(900.00));

        System.out.println("Recipes test finished");
    }

}
