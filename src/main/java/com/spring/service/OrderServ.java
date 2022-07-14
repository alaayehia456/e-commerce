package com.spring.service;


import com.spring.Dao.OrderRepo;
import com.spring.model.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderServ {
    private OrderRepo orderRepo;

    @Autowired
    public OrderServ(OrderRepo orderRepo) {
        this.orderRepo = orderRepo;
    }

    public List<Order> orders(int page,int size) {
        Pageable pageable= PageRequest.of(page,size);
        return orderRepo.findAll(pageable).getContent();
    }

    public List<Order> getorderByID(Long id,int page,int size) {
        Pageable pageable= PageRequest.of(page,size);
        return orderRepo.findByCategoryId(id,pageable).getContent();
    }

    public List<Order> getserchName(String name,int page,int size) {
        Pageable pageable= PageRequest.of(page,size);
        return orderRepo.findByNameContaining(name,pageable).getContent();
    }

    public Order getOrderById(long id) {

        return orderRepo.findById(id).get();


    }


    public int getSizeOfOrder(){

       return   orderRepo.findAll().size();
    }

    public Long getCountOrderByCategoryId(Long id){

        return orderRepo.getOrderLengthByCategoryId(id);
    }

    public Long getCountOrderByCategoryName(String name){
        return orderRepo.getOrderSizeName(name);
    }


}
