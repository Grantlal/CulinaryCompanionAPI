package com.culinarycompanion.culinarycompanion;

import Classes.Recipe;
import org.json.simple.parser.ParseException;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.util.*;

@RestController
public class CulinaryCompanionController {

    @CrossOrigin(origins = "http://localhost:5000")
    @RequestMapping("/recipes")
    public Recipe returnRecipes() throws IOException, ParseException {
        Recipe recipe = new Recipe("beef");
        System.out.println(recipe);
        return recipe;
    }

    @RequestMapping("")
    public String blank() { return "Culinary Companion base-page :)"; }
}
