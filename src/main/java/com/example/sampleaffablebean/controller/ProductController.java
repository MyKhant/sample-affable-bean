package com.example.sampleaffablebean.controller;

import com.example.sampleaffablebean.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/product")
public class ProductController {
    @Autowired
    private ProductService productService;

    @GetMapping("/products")
    public String listProduct(Model model, @RequestParam("id") int id){
        model.addAttribute("products",productService.listProductByCategory(id));
        return "products";
    }
}
