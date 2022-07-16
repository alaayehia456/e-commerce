package com.spring.Dao;

import com.spring.model.status;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface satausDao extends JpaRepository<status,Long> {

    @Query("select u from status u where u.Country.id = ?1")
    public List<status> findByCountryCode(@Param("code") Long id);

}
