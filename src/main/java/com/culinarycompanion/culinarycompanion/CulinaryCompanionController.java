package com.culinarycompanion.culinarycompanion;

import Classes.Recipe;
import Classes.RetrieveData;
import org.json.simple.parser.ParseException;
import org.springframework.web.bind.annotation.*;

import javax.validation.constraints.Null;
import java.io.IOException;
import java.util.*;

@RestController
@RequestMapping("/")
public class CulinaryCompanionController {

    @CrossOrigin(origins = "http://localhost:5000")
    //When getting the info from the frontend the /recipes needs to be /recipes/beef to search for beef
    //If /recipes/search=beef is used, then the api call will be search=beef and not just beef
    //Through further trial it was found that the url should be /recipes/beef/high-protein to get a result
    //We will need to create a new /variable every time we want to make the search any more complex

    @GetMapping("/recipes")
    public List<Recipe> returnRecipes(@RequestParam String search, @RequestParam(required = false) String ingr, @RequestParam(required = false) String diet, @RequestParam(required = false) String health, @RequestParam(required = false) String cuisineType, @RequestParam(required = false) String mealType, @RequestParam(required = false) String dishType, @RequestParam(required = false) String calories, @RequestParam(required = false) String excluded) throws IOException, ParseException {
        System.out.println(search);
        RetrieveData data = new RetrieveData(search, ingr, diet, health, cuisineType, mealType, dishType, calories, excluded);
        return data.recipeList;
    }

    @RequestMapping("")
    public String blank() {
        return "Culinary Companion base-page :)";
    }
}
