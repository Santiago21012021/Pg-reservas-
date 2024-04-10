package com.example.demo.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.ReservaDisponible;

@Repository
public interface ReservaDisponibleRepository extends JpaRepository<ReservaDisponible,Long>{

}
