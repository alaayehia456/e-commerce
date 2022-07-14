package com.spring.service;



import com.spring.Dao.CategoryRepo;
import com.spring.model.Categor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryServ {
    private CategoryRepo categoryRepo;

    @Autowired
    public CategoryServ(CategoryRepo categoryRepo) {
        this.categoryRepo = categoryRepo;
    }

    public List<Categor> categories(){
        return categoryRepo.findAll();
    }

}
