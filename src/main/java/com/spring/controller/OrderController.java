package com.spring.controller;



import com.spring.model.Order;
import com.spring.service.OrderServ;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class OrderController {

    private OrderServ orderServ;

    @Autowired
    public OrderController(OrderServ orderServ) {
        this.orderServ = orderServ;
    }

    @GetMapping("/allOrders")
    public List<Order> allOrders(@RequestParam int page,@RequestParam int size){
        return orderServ.orders(page,size);
    }

    @GetMapping("/category")
    public  List<Order> getAllOrder(@RequestParam Long id,@RequestParam int page,@RequestParam int size){

        return this.orderServ.getorderByID(id,page,size);
    }

    @GetMapping("/search")
    public List<Order> getBySearch(@RequestParam String name,@RequestParam int page,@RequestParam int size){
        return orderServ.getserchName(name,page,size);
    }

    @GetMapping("/getorder")
    public Order getOrderById(@RequestParam Long id){
        return orderServ.getOrderById(id);
    }


    @GetMapping("sizeoforder")
    public int orderSize(){
        return orderServ.getSizeOfOrder();
    }

    @GetMapping("countorder")
    public Long getOrderByCategoryId(Long id){

       return   orderServ.getCountOrderByCategoryId(id);

    }

    @GetMapping("countorderbyname")
    public Long getOrderByCategoryName(@RequestParam String name){

        return orderServ.getCountOrderByCategoryName(name);
    }



}
