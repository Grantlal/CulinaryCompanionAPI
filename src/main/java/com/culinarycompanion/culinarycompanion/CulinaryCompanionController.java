package com.culinarycompanion.culinarycompanion;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CulinaryCompanionController {

    @RequestMapping("/recipes")
    public String index() {
        return "Fake recipes YEEEERRRRR";
    }

}
