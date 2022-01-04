package com.tonyvo.hibernatespringdemo.controller;

import com.tonyvo.hibernatespringdemo.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping(value = "/my-product")
public class ProductController {

    @Autowired
    private ProductService productService;

    @GetMapping()
    public String myProduct(@RequestParam(name="name", required=false, defaultValue="World") String name, Model model) {
        model.addAttribute("name", name);
        return "my-product";
    }
}
