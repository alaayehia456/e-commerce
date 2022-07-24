package com.spring.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.spring.service.purchaseService;
import com.spring.dto.*;

@RestController
@RequestMapping("/api/buy")
public class purchasaController {

    @Autowired
    private purchaseService service;


    @PostMapping("/purchase")
    public pruchesRespons addRequstOrder(@RequestBody pruchesRequest p){
        return service.addRequestOrder(p);
    }


}
