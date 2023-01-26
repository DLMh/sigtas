package com.dge.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.dge.repository.EnterpriseRepository;

@Service
public class EnterpriseService {
    private final EnterpriseRepository enterpriseRepository;
    
    @Autowired
    public EnterpriseService(EnterpriseRepository enterpriseRepository) {
        this.enterpriseRepository = enterpriseRepository;
    }

}
