package com.spring.Dao;

import org.springframework.data.jpa.repository.JpaRepository;
import com.spring.model.client;
import org.springframework.stereotype.Repository;

@Repository
public interface clientDao extends JpaRepository<client,Long> {
}
