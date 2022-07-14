package com.spring.controller;


import com.spring.model.Categor;
import com.spring.service.CategoryServ;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CategoryController {

    private CategoryServ categoryServ;

    @Autowired
    public CategoryController(CategoryServ categoryServ) {
        this.categoryServ = categoryServ;
    }

    @GetMapping("/allCategory")
    public List<Categor> allCategory(){
        return categoryServ.categories();
    }

}
