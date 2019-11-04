package com.culinarycompanion.culinarycompanion;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import Classes.UrlMaker;
import java.io.IOException;
import org.springframework.web.util.UriComponentsBuilder;


public class urlMakerTest {
    @Test
    public void RetrieveWorks() {

        System.out.println("Url maker test starting");

        String search  = "CrustyToasterStrudel";
        String diet = "";
        String ingr = "";
        String health = "";
        String cuisineType = "";
        String mealType = "";
        String dishType = "";
        String calories = "";
        String excluded = "";
        String errorMessage = "Happy Halloween";

        UrlMaker goodUrl = new UrlMaker();
        UrlMaker badUrl = new UrlMaker(new Exception(errorMessage));


        try {
            UrlMaker url = new UrlMaker(search, ingr, diet, health, cuisineType, mealType, dishType, calories, excluded);
            goodUrl = url;
        }
        catch(Exception e) {
            e.printStackTrace();
        }
        System.out.println(goodUrl);

        //Assert our new url has our search term.
        assertTrue(goodUrl.toString().contains(search));

        //Assert our badUrl has the error message.
        assertTrue(badUrl.getErrorMessage().contains(errorMessage));

        System.out.println("Url maker test finished");
    }

}
