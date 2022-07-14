package com.spring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import com.spring.service.*;
import com.spring.model.*;

import java.util.List;

@RestController

public class countryController {

    @Autowired
    private countryService countrServices;


    @GetMapping("allcountry")
    public List<country> getAllCountry(){
        return countrServices.getAllCountry();
    }

}
