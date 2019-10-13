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
        mapForUrl.put("q=", search);
        mapForUrl.put("app_id", "9a0c84a3");
        mapForUrl.put("app_key", "45bb00840fe3a634d119f86ff069c199");
        mapForUrl.put("from", "0");
        mapForUrl.put("to", "3");
        mapForUrl.put("ingr", ingr);
        mapForUrl.put("diet", diet);
        mapForUrl.put("health", health);
        mapForUrl.put("cuisineType", cuisineType);
        mapForUrl.put("mealType", mealType);
        mapForUrl.put("dishType", dishType);
        mapForUrl.put("calories", calories);
        mapForUrl.put("excluded", excluded);

        String stringURL = (mainUrl+"q="+mapForUrl.get("q=")+and+"app_id="+mapForUrl.get("app_id")+and+"app_key="+mapForUrl.get("app_key")+and+"from="+mapForUrl.get("from")+and+"to="+mapForUrl.get("to"));
        stringURL = stringURL+"&diet="+mapForUrl.get("diet");

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
