package com.spring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.spring.service.*;
import com.spring.model.*;

import java.util.List;

@RestController
public class statusController {
    @Autowired
    private statusSerivce statusSerivce;

    @GetMapping("all status")
    public List<status> getAllStatus(){
        return statusSerivce.getAllStatus();
    }

    @GetMapping("status by country")
    public List<status> getAllStatusCountry(@RequestParam String  code){
       return   statusSerivce.getStatusByCountryCode(code);
    }



}
