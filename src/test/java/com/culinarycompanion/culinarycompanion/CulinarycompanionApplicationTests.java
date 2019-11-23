package com.culinarycompanion.culinarycompanion;
import org.junit.jupiter.api.Test;
import com.mongodb.client.MongoDatabase;
import com.mongodb.MongoClient;
import com.mongodb.MongoCredential;

import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import static org.junit.jupiter.api.Assertions.assertEquals;

@RunWith(SpringRunner.class)
@SpringBootTest
//@SpringBootApplication(exclude = MongoAutoConfiguration.class)
public class CulinarycompanionApplicationTests {

    @Test
    public void contextLoads() {
        System.out.println("UWU the webApp loaded");
    }

}
