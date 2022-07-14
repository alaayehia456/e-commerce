package com.spring.Dao;

import com.spring.model.status;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface satausDao extends JpaRepository<status,Long> {
}
