package com.example.demo.controllers;

import com.example.demo.models.Song;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class HomeController {

    @GetMapping("/songform")
    public String loadFormPage (Model model){
        System.out.println("i'm here 1");
        model.addAttribute("song", new Song());
        System.out.println("i'm here 2");
        return "songform";
    }


    @PostMapping("/songform")
    public String loadFromPage (@ModelAttribute Song song, Model model){
        System.out.println("i'm here 3");
        model.addAttribute("song", song);
        System.out.println("i'm here 4");
        return "confirmsong";
    }
}
