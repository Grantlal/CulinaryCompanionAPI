package com.culinarycompanion.culinarycompanion;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.*;

@RestController
public class CulinaryCompanionController {

    @CrossOrigin(origins = "http://localhost:5000")
    @RequestMapping("/recipes")
    public Map returnRecipes() {
        Map potentialValues = new HashMap();
        potentialValues.put("firstRecipe", "Chicken Tikka");
        potentialValues.put("secondRecipe", "Steak au poivre");
        return potentialValues;
    }

    @RequestMapping("")
    public String blank() { return "Culinary Companion base-page :)"; }
}
