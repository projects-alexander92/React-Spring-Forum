package com.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
@CrossOrigin(origins = "http://localhost:3000")
public class HomeController
{
    @GetMapping("/")
    private String getReact()
    {
        return "index.html";
    }

}
