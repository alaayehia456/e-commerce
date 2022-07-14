package com.spring.service;

import com.spring.Dao.countryDao;
import com.spring.model.country;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class countryService {

    @Autowired
    private countryDao   countryDao;



    public List<country> getAllCountry(){

        return countryDao.findAll();
    }
}



