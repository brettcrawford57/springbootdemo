package com.codeup.catdemo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

public class catcontroller {

    @Controller
    class HelloCatController {

        @GetMapping("/hellocat")
        @ResponseBody
        public String hello() {
            return "Hello kitty cat!";
        }
    }
}
