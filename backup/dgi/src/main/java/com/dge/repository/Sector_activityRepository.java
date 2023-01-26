package com.dge.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.dge.models.Sector_activity;

@Repository
public interface Sector_activityRepository extends JpaRepository<Sector_activity,Long> {
    
}
