package com.example.mvc.controller;

import com.example.mvc.model.Product;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ProductController {

    @GetMapping("/")
    public String main(Model model) {
        var product = new Product(1, "Beer", "Brown");

        model.addAttribute("name", product.name());

        return "main.html";
    }
}
