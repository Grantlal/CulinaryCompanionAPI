package Classes;

import java.util.*;
import com.mongodb.client.MongoDatabase;
import com.mongodb.MongoClient;
import com.mongodb.MongoClientURI;
import com.mongodb.MongoCredential;

public class RetrieveTechnique {
    public RetrieveTechnique() { };
    public String getTechnique(String searchTerm)
    {
        String userNameAndPass = "Yeet";
        MongoClientURI connectionString = new MongoClientURI("mongodb+srv://Grant:Turtle@cluster0-knqq3.mongodb.net/test?retryWrites=true&w=majority");
        //mongodb+srv://Yeet:Yeet@cluster0-knqq3.mongodb.net/test?retryWrites=true&w=majority

        try {
            MongoClient mongo = new MongoClient(connectionString);
            MongoDatabase database = mongo.getDatabase("sample_airbnb");
            database.createCollection("potatos");
            System.out.println("success");
        } catch (Exception e)
        {
            System.out.println("UWU FUCKER");
            e.printStackTrace();
        }

        return "fuck mark";
    }
}