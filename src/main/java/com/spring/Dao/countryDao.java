package com.spring.Dao;

import com.spring.model.country;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface countryDao extends JpaRepository<country,Long> {


    public country findByCode(@Param("code") String code);
}
