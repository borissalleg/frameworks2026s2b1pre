package com.example.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.Model.Flores;
@Repository 
public interface florRepository extends JpaRepository<Flores, Long> {
    
}
