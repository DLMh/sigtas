package com.dge.repository;

import org.springframework.stereotype.Repository;

import com.dge.models.Division;

import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface DivisionRepository extends JpaRepository<Division,Long>{
    
}
