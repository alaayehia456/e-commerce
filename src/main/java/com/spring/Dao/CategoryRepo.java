package com.spring.Dao;

import com.spring.model.Categor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface CategoryRepo extends JpaRepository<Categor,Long> {
}
