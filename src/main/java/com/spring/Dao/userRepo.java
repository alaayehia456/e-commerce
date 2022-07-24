package com.spring.Dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spring.model.user;
import org.springframework.stereotype.Repository;

@Repository
public interface userRepo extends JpaRepository<user,Long> {
}
