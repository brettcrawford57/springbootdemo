package com.codeup.catdemo.controllers;

import com.codeup.catdemo.models.Cat;
import com.codeup.catdemo.repos.catDao;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

    @Controller
    public class Catcontroller {

        private final catDao catRepo;

        public Catcontroller(catDao catRepo) {
            this.catRepo = catRepo;
        }

        @GetMapping("/hellocat")
        @ResponseBody
        public String hello() {
            return "Hello kitty cat!";
        }

        @GetMapping("/create")
        public String catCreation (Model model){
            model.addAttribute("cat", new Cat());
            return "/Cats/create";
        }



        @PostMapping("/create")
        public String saveCatCreation(@ModelAttribute Cat cat){
            Cat savedCatCreation = catRepo.save(cat);
            return "redirect:/Cats/" + savedCatCreation.getCatId();
        }


    }

