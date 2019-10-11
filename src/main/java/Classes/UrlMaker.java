package Classes;

import java.io.*;
import java.net.*;
import java.nio.charset.Charset;

public class UrlMaker{
    URL url;
    String search;

    public UrlMaker(String search) throws MalformedURLException {
        this.search = "chicken";
        this.url = new URL("https://api.edamam.com/search?q="+search+"&app_id=9a0c84a3&app_key=45bb00840fe3a634d119f86ff069c199&from=0&to=3");
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
