package com.portfolio.controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@org.springframework.stereotype.Controller
@RequestMapping("/portfolio")
public class Controller {

    @GetMapping("/")
    public String home(Model model) {
        model.addAttribute("msg","sample code to be added");
        return "home";
    }
}
