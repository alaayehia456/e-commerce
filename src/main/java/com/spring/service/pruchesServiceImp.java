package com.spring.service;

import com.spring.dto.pruchesRequest;
import com.spring.dto.pruchesRespons;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.spring.model.*;
import com.spring.Dao.*;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Service
public class pruchesServiceImp implements purchaseService{

    @Autowired
    private clientDao dao;

    @Override
    @Transactional
    public pruchesRespons addRequestOrder(pruchesRequest p) {

        reqestOrder reqestOrder=p.getReqestorder();

        String code=getcode();


        reqestOrder.setCode(code);

        reqestOrder.setItemList(p.getItemList());
        p.getItemList().forEach(item -> item.setOrder(reqestOrder));


        reqestOrder.setFromAddress(p.getFromAddress());
        reqestOrder.setAddress(p.getToAddress());

        List<reqestOrder> list=new ArrayList<>();
        list.add(reqestOrder);
        p.getClient1().setReqestOrderList(list);
        reqestOrder.setClients(p.getClient1());

        dao.save(p.getClient1());

        return new pruchesRespons(p.getClient1().getFullName(),code);
    }

    private String getcode() {
        return UUID.randomUUID().toString();
    }


}
