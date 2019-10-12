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
    //Through further trial it was found that the url should be /recipies/beef&low-fat to get a result
    @RequestMapping(value="/recipes/{search}&{diet}",method= RequestMethod.GET)
    public List<Recipe> returnRecipes(@PathVariable String search, @PathVariable String diet) throws IOException, ParseException {
        Recipe recipe = new Recipe(search);
        RetrieveData data = new RetrieveData(search);
        return data.recipeList;
    }

    @RequestMapping("")
    public String blank() { return "Culinary Companion base-page :)"; }
}
