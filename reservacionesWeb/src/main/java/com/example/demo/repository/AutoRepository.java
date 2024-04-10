package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.Auto;


public interface AutoRepository extends JpaRepository<Auto,String> {

}
