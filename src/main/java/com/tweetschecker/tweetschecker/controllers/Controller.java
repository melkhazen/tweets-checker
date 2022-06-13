package com.tweetschecker.tweetschecker.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Mohamed Elkahzen
 * @13/06/2022 - 8:32 AM
 * @project tweets-checker
 */

@RestController()
public class Controller {

    @RequestMapping("/")
    public String helloWorld() {
        return "Hello World!";
    }

    @RequestMapping("/restricted")
    public String restricted() {
        return "to dee this page you need to be logged in!";
    }
}
