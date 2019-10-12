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
    @RequestMapping(value="/recipes{search}",method= RequestMethod.GET)
    public Recipe returnRecipes(@PathVariable String search) throws IOException, ParseException {
        Recipe recipe = new Recipe(search);
        RetrieveData data = new RetrieveData(search);
        return recipe;
    }

    @RequestMapping("")
    public String blank() { return "Culinary Companion base-page :)"; }
}
