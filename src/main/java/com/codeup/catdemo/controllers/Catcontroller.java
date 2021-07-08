package com.codeup.catdemo.controllers;

import com.codeup.catdemo.models.Cat;
import com.codeup.catdemo.repos.catDao;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

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
    public String catCreation(Model model) {
        model.addAttribute("cat", new Cat());
        return "/Cats/create";
    }

    @PostMapping("/create")
    public String saveCatCreation(@ModelAttribute Cat cat) {
        Cat savedCatCreation = catRepo.save(cat);
        return "redirect:/Cats/" + savedCatCreation.getCatId();
    }

    @GetMapping("/Cats/{catId}")
    public String showCats(@PathVariable long catId, Model model) {
        model.addAttribute("cat", catRepo.getById(catId));
        return "/Cats/show";
    }

    @GetMapping("/index")
    public String showAllCats(Model model){
        model.addAttribute("cat", catRepo.findAll());
        return "/Cats/index";
    }

}

