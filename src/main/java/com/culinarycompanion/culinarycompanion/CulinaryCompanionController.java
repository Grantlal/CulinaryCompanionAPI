package com.culinarycompanion.culinarycompanion;

import Classes.Recipe;
import Classes.RecipeTechnique;
import Classes.RetrieveRecipeData;
import org.json.simple.parser.ParseException;
import org.springframework.web.bind.annotation.*;

import javax.validation.constraints.Null;
import java.io.IOException;
import java.util.*;

@RestController
@RequestMapping("/")
public class CulinaryCompanionController {

    @CrossOrigin(origins = "http://localhost:5000")
    @CrossOrigin(origins = "https://culinary-companions.herokuapp.com/")

    @GetMapping("/recipes")
    public List<Recipe> returnRecipes(
            @RequestParam String search,
            @RequestParam(required = false) String ingr,
            @RequestParam(required = false) String diet,
            @RequestParam(required = false) String health,
            @RequestParam(required = false) String cuisineType,
            @RequestParam(required = false) String mealType,
            @RequestParam(required = false) String dishType,
            @RequestParam(required = false) String calories,
            @RequestParam(required = false) String excluded) throws IOException,
            ParseException
    {
        RetrieveRecipeData data = new RetrieveRecipeData(search, ingr, diet, health, cuisineType, mealType, dishType, calories, excluded);
        return data.recipeList;
    }

    @GetMapping("/technique")
    public String returnTechEndPoint(){
        RecipeTechnique technique = new RecipeTechnique();
        return technique.returnConfirmation();
    }

    @GetMapping("/technique/test")
    public String returnTechEndPointTest(){
        return "https://www.youtube.com/watch?v=bpbMtzz7pb8&feature=youtu.be";
    }

    @RequestMapping("")
    public String blank() {
        return "Culinary Companion base-page :)";
    }
}
