package Classes;

import java.net.URL;
import java.io.Reader;
import java.io.IOException;
import java.nio.charset.Charset;
import java.io.InputStreamReader;
import java.net.MalformedURLException;

public class UrlMaker {
    private URL url;
    private String sizeOfReturn = "&from=0&to=3";

    public UrlMaker(String search) throws MalformedURLException {
        this.url = new URL("https://api.edamam.com/search?q="+search+"&app_id=9a0c84a3&app_key=45bb00840fe3a634d119f86ff069c199"+sizeOfReturn);
    }

    public Reader reader() throws IOException {
        Reader reader = new InputStreamReader(this.url.openStream(), Charset.defaultCharset());
        return reader;
    }

    @Override
    public String toString(){
        return this.url.toString();
    }
}
