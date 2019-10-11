package Classes;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import java.io.IOException;
import java.io.Reader;
import java.util.HashMap;

class RetrieveData {
    Double calories;
    Double totalTime;
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

    HashMap<String, JSONArray> mapArray = new HashMap<>();
    HashMap<String, JSONObject> mapObject = new HashMap<>();

    public RetrieveData(String search) throws IOException, ParseException {
        UrlMaker url = new UrlMaker(search);
        Reader reader = url.reader();
        Object obj = new JSONParser().parse(reader);
        JSONObject jo = (JSONObject) obj;
        JSONArray hits = (JSONArray) jo.get("hits");

        mapPopulation(hits);
    }

    public void mapPopulation(JSONArray hits){
        this.exactHit = (JSONObject) hits.get(0);
        mapObject.put("hits",this.exactHit);
        this.recipe = (JSONObject) exactHit.get("recipe");
        mapObject.put("recipe",this.recipe);
        this.dietLabels = (JSONArray) recipe.get("dietLabels");
        mapArray.put("dietLabels",this.dietLabels);
        this.healthLabels = (JSONArray) recipe.get("healthLabels");
        mapArray.put("healthLabels",this.healthLabels);
        this.cautions = (JSONArray) recipe.get("cautions");
        mapArray.put("cautions",this.cautions);
        this.ingredientLines = (JSONArray) recipe.get("ingredientLines");
        mapArray.put("ingredientLines",this.ingredientLines);
        this.ingredients = (JSONArray) recipe.get("ingredients");
        mapArray.put("ingredients",this.ingredients);
        this.calories = (Double) recipe.get("calories");
        this.totalTime = (Double) recipe.get("totalTime");
        this.totalNutrients = (JSONObject) recipe.get("totalNutrients");
        mapObject.put("totalNutrients",this.totalNutrients);
        this.totalDaily = (JSONObject) recipe.get("totalDaily");
        mapObject.put("totalDaily",this.totalDaily);
        this.digest = (JSONArray) recipe.get("digest");
        mapArray.put("digest",this.digest);
    }

}