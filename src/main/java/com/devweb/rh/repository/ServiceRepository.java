package com.devweb.rh.repository;

import com.devweb.rh.model.Service;
import com.devweb.rh.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;


@Repository
public interface ServiceRepository extends JpaRepository<Service, Integer> {

}