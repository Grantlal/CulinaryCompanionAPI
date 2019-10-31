package com.culinarycompanion.culinarycompanion;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import Classes.RetrieveRecipeData;
import java.io.IOException;
import org.springframework.web.util.UriComponentsBuilder;


public class RetrieveRecipeDataTest {
    @Test
    public void RetrieveWorks() {

        System.out.println("Retrieve recipes test starting");

        String search  = "chicken";
        String diet = null;
        String ingr = null;
        String health = null;
        String cuisineType = null;
        String mealType = null;
        String dishType = null;
        String calories = null;
        String excluded = null;

        RetrieveRecipeData goodData = new RetrieveRecipeData();
        RetrieveRecipeData badData = new RetrieveRecipeData(new Exception("error, bad uWu"));


        try {
            RetrieveRecipeData testData = new RetrieveRecipeData(search, ingr, diet, health, cuisineType, mealType, dishType, calories, excluded);
            goodData = testData;

        } catch(Exception e) {
            e.printStackTrace();
        }



        //Keeping this here for debuggin purpose in case we need it.
        //System.out.println(data.recipeList.toString());

        //This is also a lazy assertion, but essentially if our retrieval attempt was successful we'll something with chicken.
        assertTrue(goodData.recipeList.toString().contains(search));
        System.out.println("Retrieve recipes test finished");

        //ensure we get a dumb error.
        assertTrue(badData.getErrorMessage().contains("error"));
    }

}
