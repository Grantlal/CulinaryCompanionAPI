package Classes;


import java.io.IOException;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.ParseException;


public class Recipe {
    private Double calories;
    private Double totalTime;
    private JSONArray hits;
    private JSONArray digest;
    private JSONObject recipe;
    private JSONArray cautions;
    private JSONObject exactHit;
    private JSONArray dietLabels;
    private JSONObject totalDaily;
    private JSONArray ingredients;
    private JSONArray healthLabels;
    private JSONArray ingredientLines;
    private JSONObject totalNutrients;

    public Recipe(){}

    public Recipe(String search) throws IOException, ParseException {
        RetrieveData dataRetrieved = new RetrieveData(search);
        this.calories = dataRetrieved.calories;
        this.totalTime = dataRetrieved.totalTime;
        this.hits = dataRetrieved.mapArray.get("hits");
        this.digest = dataRetrieved.mapArray.get("digest");
        this.recipe = dataRetrieved.mapObject.get("recipe");
        this.cautions = dataRetrieved.mapArray.get("cautions");
        this.exactHit = dataRetrieved.mapObject.get("exactHit");
        this.dietLabels = dataRetrieved.mapArray.get("dietLabels");
        this.totalDaily = dataRetrieved.mapObject.get("totalDaily");
        this.ingredients = dataRetrieved.mapArray.get("ingredients");
        this.healthLabels = dataRetrieved.mapArray.get("healthLabels");
        this.ingredientLines = dataRetrieved.mapArray.get("ingredientLines");
        this.totalNutrients = dataRetrieved.mapObject.get("totalNutrients");

        System.out.println(dataRetrieved.recipeList.get(0));
    }

    public Double getCalories() {
        return calories;
    }

    public void setCalories(Double calories) {
        this.calories = calories;
    }

    public Double getTotalTime() {
        return totalTime;
    }

    public void setTotalTime(Double totalTime) {
        this.totalTime = totalTime;
    }

    public JSONArray getHits() {
        return hits;
    }

    public void setHits(JSONArray hits) {
        this.hits = hits;
    }

    public JSONArray getDigest() {
        return digest;
    }

    public void setDigest(JSONArray digest) {
        this.digest = digest;
    }

    public JSONObject getRecipe() {
        return recipe;
    }

    public void setRecipe(JSONObject recipe) {
        this.recipe = recipe;
    }

    public JSONArray getCautions() {
        return cautions;
    }

    public void setCautions(JSONArray cautions) {
        this.cautions = cautions;
    }

    public JSONObject getExactHit() {
        return exactHit;
    }

    public void setExactHit(JSONObject exactHit) {
        this.exactHit = exactHit;
    }

    public JSONArray getDietLabels() {
        return dietLabels;
    }

    public void setDietLabels(JSONArray dietLabels) {
        this.dietLabels = dietLabels;
    }

    public JSONObject getTotalDaily() {
        return totalDaily;
    }

    public void setTotalDaily(JSONObject totalDaily) {
        this.totalDaily = totalDaily;
    }

    public JSONArray getIngredients() {
        return ingredients;
    }

    public void setIngredients(JSONArray ingredients) {
        this.ingredients = ingredients;
    }

    public JSONArray getHealthLabels() {
        return healthLabels;
    }

    public void setHealthLabels(JSONArray healthLabels) {
        this.healthLabels = healthLabels;
    }

    public JSONArray getIngredientLines() {
        return ingredientLines;
    }

    public void setIngredientLines(JSONArray ingredientLines) {
        this.ingredientLines = ingredientLines;
    }

    public JSONObject getTotalNutrients() {
        return totalNutrients;
    }

    public void setTotalNutrients(JSONObject totalNutrients) {
        this.totalNutrients = totalNutrients;
    }

    @Override
    public String toString() {
        return "digest " + this.digest +
                "\nrecipe " + this.recipe +
                "\nCalories " + this.calories +
                "\ncautions " + this.cautions +
                "\ntotalTime " + this.totalTime +
                "\ndietLabels " + this.dietLabels +
                "\ntotalDaily " + this.totalDaily +
                "\ningredients " + this.ingredients +
                "\nhealthLabels " + this.healthLabels +
                "\ntotalNutrients " + this.totalNutrients +
                "\ningredientsLines " + this.ingredientLines;

    }
}
