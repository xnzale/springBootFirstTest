package com.devweb.rh.repository;

import com.devweb.rh.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface EmployeRepository extends JpaRepository<User, Long> {
    
}