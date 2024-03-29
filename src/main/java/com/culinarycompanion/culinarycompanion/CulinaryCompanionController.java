package com.culinarycompanion.culinarycompanion;

import Classes.Recipe;
import Classes.Technique;
import Classes.RetrieveTechnique;
import Classes.RetrieveRecipeData;
import org.json.simple.parser.ParseException;
import org.springframework.web.bind.annotation.*;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.data.mongo.MongoDataAutoConfiguration;
import org.springframework.boot.autoconfigure.data.web.SpringDataWebAutoConfiguration;
import org.springframework.boot.autoconfigure.mongo.MongoAutoConfiguration;

import javax.validation.constraints.Null;
import java.io.IOException;
import java.util.*;

@SpringBootApplication(exclude = {MongoAutoConfiguration.class, MongoDataAutoConfiguration.class,
        SpringDataWebAutoConfiguration.class})
@RestController
@RequestMapping("/")
public class CulinaryCompanionController {

    @CrossOrigin
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

    @CrossOrigin
    @GetMapping("/techniques")
    public String returnTechEndPoint(@RequestParam String searchTag){
        RetrieveTechnique newTechniqueAttempt = new RetrieveTechnique();
        return newTechniqueAttempt.getTechniqueByName(searchTag).toString();
    }

    @CrossOrigin
    @GetMapping("/techniques/Url")
    public String returnTechEndPointTest(@RequestParam String searchName){
        RetrieveTechnique newTechniqueAttempt = new RetrieveTechnique();
        return newTechniqueAttempt.getTechniqueUrlByName(searchName).toString();
    }

    @CrossOrigin
    @RequestMapping("")
    public String blank() {
        return "Culinary Companion base-page :)";
    }
}
