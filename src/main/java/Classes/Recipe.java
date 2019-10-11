package Classes;

import java.io.*;
import org.json.simple.*;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class Recipe {

    private String search;
    private UrlMaker url = new UrlMaker(search);
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

    public Recipe(String search) throws IOException, ParseException {
        this.search = search;
    }

}
