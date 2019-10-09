package com.culinarycompanion.culinarycompanion;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CulinaryCompanionController {

    @CrossOrigin(origins = "http://localhost:5000")
    @RequestMapping("/recipes")
    public String index() {
        return "Fake recipes YEEEERRRRR";
    }

    @RequestMapping("")
    public String blank() { return "Culinary Companion base-page :)"; }
}
