package com.spring.service;

import com.spring.Dao.countryDao;
import com.spring.Dao.satausDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Service;

import com.spring.model.*;

import java.util.List;

@Service
public class statusSerivce {

    @Autowired
    private satausDao statusDao;

    @Autowired
    private countryDao dao;

    public List<status> getAllStatus(){
        return statusDao.findAll();
    }



    public List<status> getStatusByCountryCode(String code){


        country c=dao.findByCode(code);



      return  statusDao.findByCountryCode(c.getId());

    }





}
