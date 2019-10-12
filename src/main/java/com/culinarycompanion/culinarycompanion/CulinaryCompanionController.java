package com.culinarycompanion.culinarycompanion;

import Classes.Recipe;
import Classes.RetrieveData;
import org.json.simple.parser.ParseException;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;
import java.util.*;

@RestController
public class CulinaryCompanionController {

    @CrossOrigin(origins = "http://localhost:5000")
    //When getting the info from the frontend the /recipes needs to be /recipes/beef to search for beef
    //If /recipes/search=beef is used, then the api call will be search=beef and not just beef
    //Through further trial it was found that the url should be /recipes/beef/high-protein to get a result
    //We will need to create a new /variable every time we want to make the search any more complex
    @RequestMapping(value = "/recipes/{search}", method = RequestMethod.GET)
    public List<Recipe> returnRecipes(@PathVariable String search) throws IOException, ParseException {
        RetrieveData data = new RetrieveData(search);
        System.out.println("Flag1 returnRecipes");
        return data.recipeList;
    }

    @RequestMapping(value = "/recipes/{search}/{diet}", method = RequestMethod.GET)
    public List<Recipe> returnRecipes(@PathVariable String search, @PathVariable String diet) throws IOException, ParseException {
        RetrieveData data = new RetrieveData(search, diet);
        System.out.println("Flag2 returnRecipes");
        return data.recipeList;
    }

    @RequestMapping("")
    public String blank() {
        return "Culinary Companion base-page :)";
    }
}
