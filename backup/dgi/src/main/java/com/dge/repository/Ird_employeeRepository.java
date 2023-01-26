package com.dge.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.dge.models.Ird_employee;

@Repository
public interface Ird_employeeRepository extends JpaRepository<Ird_employee,Long> {
    
}
