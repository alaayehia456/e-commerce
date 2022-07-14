package com.spring.Dao;


import com.spring.model.Order;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface OrderRepo extends JpaRepository<Order,Long> {

    public Page<Order> findByCategoryId(@Param("id") Long id, @Param("pageable")Pageable pageable);

    public Page<Order> findByNameContaining(@Param("name") String name,@Param("pageable") Pageable pageable);



    @Query("select count (id) from Order where category.id=?1")
    public Long getOrderLengthByCategoryId(Long id);


    @Query("select count (id) from Order where name like %?1%")
    public Long getOrderSizeName(@Param("key") String key);

}
