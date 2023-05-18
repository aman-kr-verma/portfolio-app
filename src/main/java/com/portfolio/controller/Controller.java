package com.portfolio.controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@org.springframework.stereotype.Controller
public class Controller {

    @GetMapping("/")
    public String home(Model model) {
        model.addAttribute("msg","sample code to be added");
        return "home";
    }
}
