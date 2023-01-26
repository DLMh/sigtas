package com.dge.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.dge.models.*;

@Repository
public interface TaxpayerRepository extends JpaRepository<Taxpayer,Long> {
    
    @Query("SELECT t FROM Taxpayer t WHERE t.FISCAL_NO = :nif")
	Optional<Taxpayer> findbyNif(String nif);
}
