package com.tweetschecker.tweetschecker.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Mohamed Elkahzen
 * @13/06/2022 - 9:38 AM
 * @project tweets-checker
 */

@RestController()
public class LoginController {

    @GetMapping("/login")
    public String login() {
        return "login";
    }
}
