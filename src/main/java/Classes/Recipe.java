package Classes;

import java.io.*;
import org.json.simple.*;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class Recipe {

    private UrlMaker url = new UrlMaker("chicken");
    private Reader reader = url.reader();
    private Object obj = new JSONParser().parse(reader);

    //Values that will contain the main components of the jason file
    private JSONObject jo;
    private JSONArray hit;
    private Double calories;
    private JSONArray digest;
    private Double totalTime;
    private JSONObject recipe;
    private JSONArray cautions;
    private JSONObject exactHit;
    private JSONArray dietLabels;
    private JSONArray ingredients;
    private JSONObject totalDaily;
    private JSONArray healthLabels;
    private JSONArray ingredientLines;
    private JSONObject totalNutrients;

    public UrlMaker getUrl() {
        return url;
    }

    public void setUrl(UrlMaker url) {
        this.url = url;
    }

    public Reader getReader() {
        return reader;
    }

    public void setReader(Reader reader) {
        this.reader = reader;
    }

    public Object getObj() {
        return obj;
    }

    public void setObj(Object obj) {
        this.obj = obj;
    }

    public JSONObject getJo() {
        return jo;
    }

    public void setJo(JSONObject jo) {
        this.jo = jo;
    }

    public JSONArray getHit() {
        return hit;
    }

    public void setHit(JSONArray hit) {
        this.hit = (JSONArray) jo.get("hits");;
    }

    public Double getCalories() {
        return calories;
    }

    public void setCalories(Double calories) {
        this.calories = (Double) recipe.get("calories");
    }

    public JSONArray getDigest() {
        return digest;
    }

    public void setDigest(JSONArray digest) {
        this.digest = (JSONArray) recipe.get("digest");
    }

    public Double getTotalTime() {
        return totalTime;
    }

    public void setTotalTime(Double totalTime) {
        this.totalTime = (Double) recipe.get("totalTime");
    }

    public JSONObject getRecipe() {
        return recipe;
    }

    public void setRecipe(JSONObject recipe) {
        this.recipe = (JSONObject) exactHit.get("recipe");
    }

    public JSONArray getCautions() {
        return cautions;
    }

    public void setCautions(JSONArray cautions) {
        this.cautions = (JSONArray) recipe.get("cautions");
    }

    public JSONObject getExactHit() {
        return exactHit;
    }

    public void setExactHit(JSONObject exactHit) {
        this.exactHit = (JSONObject) hit.get(0);
    }

    public JSONArray getDietLabels() {
        return dietLabels;
    }

    public void setDietLabels(JSONArray dietLabels) {
        this.dietLabels = (JSONArray) recipe.get("dietLabels");
    }

    public JSONArray getIngredients() {
        return ingredients;
    }

    public void setIngredients(JSONArray ingredients) {
        this.ingredients = (JSONArray) recipe.get("ingredients");
    }

    public JSONObject getTotalDaily() {
        return totalDaily;
    }

    public void setTotalDaily(JSONObject totalDaily) {
        this.totalDaily = (JSONObject) recipe.get("totalDaily");
    }

    public JSONArray getHealthLabels() {
        return healthLabels;
    }

    public void setHealthLabels(JSONArray healthLabels) {
        this.healthLabels = (JSONArray) recipe.get("healthLabels");
    }

    public JSONArray getIngredientLines() {
        return ingredientLines;
    }

    //This is the method that should be used to get the ingredients list
    public void setIngredientLines(JSONArray ingredientLines) {
        this.ingredientLines = (JSONArray) recipe.get("ingredientLines");
    }

    public JSONObject getTotalNutrients() {
        return totalNutrients;
    }

    public void setTotalNutrients(JSONObject totalNutrients) {
        this.totalNutrients = (JSONObject) recipe.get("totalNutrients");
    }

    public Recipe() throws IOException, ParseException {
    }
}
