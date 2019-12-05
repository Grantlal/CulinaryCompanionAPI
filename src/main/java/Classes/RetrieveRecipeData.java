package Classes;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.IOException;
import java.io.Reader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class RetrieveRecipeData {

    //Can make private and make a getter function
    Double calories;
    Double totalTime;
    String errorMessage = "";

    //Can make private and make a getter function
    public List<Recipe> recipeList = new ArrayList<>();
    HashMap<String, JSONArray> mapArray = new HashMap<>();
    HashMap<String, JSONObject> mapObject = new HashMap<>();

    public RetrieveRecipeData() {}

    public RetrieveRecipeData(Exception e)
    {
        errorMessage = e.toString();
    }

    public String getErrorMessage() {
        return errorMessage;
    }

    public RetrieveRecipeData(String search, String ingr, String diet, String health, String cuisineType, String mealType, String dishType, String calories, String excluded) throws IOException, ParseException {
        UrlMaker url = new UrlMaker(search, ingr, diet, health, cuisineType, mealType, dishType, calories, excluded);
        Reader reader = url.reader();
        Object obj = new JSONParser().parse(reader);
        JSONObject jo = (JSONObject) obj;
        JSONArray hits = (JSONArray) jo.get("hits");

        populateRecipeList(hits);
    }

    public void populateRecipeList(JSONArray hits) {
        //Add for loop for however many recipes we want to save to the list
        int numberOfRecipesReturned = 10;
        for (int i = 0; i < numberOfRecipesReturned; i++) {
            mapPopulation(hits, i);
            Recipe recipe = new Recipe();
            recipePopulation(recipe);
            recipeList.add(recipe);
        }
    }

    private void mapPopulation(JSONArray hits, int i) {
        JSONObject exactHit = (JSONObject) hits.get(i);
        mapObject.put("hits", exactHit);
        JSONObject recipe = (JSONObject) exactHit.get("recipe");
        mapObject.put("recipe", recipe);
        JSONArray dietLabels = (JSONArray) recipe.get("dietLabels");
        mapArray.put("dietLabels", dietLabels);
        JSONArray healthLabels = (JSONArray) recipe.get("healthLabels");
        mapArray.put("healthLabels", healthLabels);
        JSONArray cautions = (JSONArray) recipe.get("cautions");
        mapArray.put("cautions", cautions);
        JSONArray ingredientLines = (JSONArray) recipe.get("ingredientLines");
        mapArray.put("ingredientLines", ingredientLines);
        JSONArray ingredients = (JSONArray) recipe.get("ingredients");
        mapArray.put("ingredients", ingredients);
        this.calories = (Double) recipe.get("calories");
        this.totalTime = (Double) recipe.get("totalTime");
        JSONObject totalNutrients = (JSONObject) recipe.get("totalNutrients");
        mapObject.put("totalNutrients", totalNutrients);
        JSONObject totalDaily = (JSONObject) recipe.get("totalDaily");
        mapObject.put("totalDaily", totalDaily);
        JSONArray digest = (JSONArray) recipe.get("digest");
        mapArray.put("digest", digest);
    }

    private void recipePopulation(Recipe recipe) {
        recipe.setCalories(this.calories);
        recipe.setTotalTime(this.totalTime);
        recipe.setHits(this.mapArray.get("hits"));
        recipe.setDigest(this.mapArray.get("digest"));
        recipe.setRecipe(this.mapObject.get("recipe"));
        recipe.setCautions(this.mapArray.get("cautions"));
        recipe.setExactHit(this.mapObject.get("exactHit"));
        recipe.setDietLabels(this.mapArray.get("dietLabels"));
        recipe.setTotalDaily(this.mapObject.get("totalDaily"));
        recipe.setIngredients(this.mapArray.get("ingredients"));
        recipe.setHealthLabels(this.mapArray.get("healthLabels"));
        recipe.setIngredientLines(this.mapArray.get("ingredientLines"));
        recipe.setTotalNutrients(this.mapObject.get("totalNutrients"));
    }

}