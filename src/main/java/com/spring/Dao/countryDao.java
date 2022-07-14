package com.spring.Dao;

import com.spring.model.country;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface countryDao extends JpaRepository<country,Long> {
}
