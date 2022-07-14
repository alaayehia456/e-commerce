package com.spring.service;

import com.spring.Dao.satausDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.model.*;

import java.util.List;

@Service
public class statusSerivce {

    @Autowired
    private satausDao statusDao;


    public List<status> getAllStatus(){
        return statusDao.findAll();
    }


}
