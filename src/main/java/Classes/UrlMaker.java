package Classes;

import java.net.URL;
import java.util.HashMap;
import java.util.Map;
import java.io.Reader;
import java.io.IOException;
import java.nio.charset.Charset;
import java.io.InputStreamReader;
import java.net.MalformedURLException;

public class UrlMaker {
    private URL url;
    private String and = "&";
    private String sizeOfReturn = "from=0&to=3";
    private String mainUrl = "https://api.edamam.com/search?";

    Map<String, String> mapForUrl = new HashMap<>();

    public UrlMaker(String search, String ingr, String diet, String health, String cuisineType, String mealType, String dishType, String calories, String excluded) throws MalformedURLException {
        //13 by 13 array
        String[][] arrayForUrl = {
                {"q=", search},//0
                {"&app_id=", "9a0c84a3"},//1
                {"&app_key=", "45bb00840fe3a634d119f86ff069c199"},//2
                {"&from=", "0"},//3
                {"&to=", "3"},//4
                {"&ingr=", ingr},//5
                {"&diet=", diet},//6
                {"&health=", health},//7
                {"&cuisineType=", cuisineType},//8
                {"&mealType=", mealType},//9
                {"&dishType=", dishType},//10
                {"&calories=", calories},//11
                {"&excluded=", excluded},};//12

        String stringURL = (mainUrl+arrayForUrl[0][0]+arrayForUrl[0][1]+arrayForUrl[1][0]+arrayForUrl[1][1]+arrayForUrl[2][0]+arrayForUrl[2][1]+arrayForUrl[3][0]+arrayForUrl[3][1]+arrayForUrl[4][0]+arrayForUrl[4][1]);

        for(int i = 5; i<12;i++){
            if(arrayForUrl[i][1] != null)
                stringURL = stringURL + arrayForUrl[i][0]+arrayForUrl[i][1];
        }

        this.url = new URL(stringURL);
        //For debugging and logs
        System.out.println("Three URL " + this.url);
    }

    public Reader reader() throws IOException {
        Reader reader = new InputStreamReader(this.url.openStream(), Charset.defaultCharset());
        return reader;
    }

    @Override
    public String toString() {
        return this.url.toString();
    }
}
