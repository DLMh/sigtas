package com.dge.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dge.dto.InfoContribu;
import com.dge.models.Enterprise;
import com.dge.repository.EnterpriseRepository;
import com.dge.repository.TaxpayerRepository;

@Service
public class InfocontribuService {
    
    private final EnterpriseRepository enterpriseRepository;
    private final TaxpayerRepository taxpayerRepository;
    
    @Autowired
    public InfocontribuService(EnterpriseRepository enterpriseRepository, TaxpayerRepository taxpayerRepository) {
        this.enterpriseRepository = enterpriseRepository;
        this.taxpayerRepository = taxpayerRepository;
    }

    public Enterprise insert(InfoContribu infoContribu){
        Enterprise e=enterpriseRepository.save(infoContribu.getEnterprise());
        return e;
    }
    public List<Enterprise> find(){
       return  enterpriseRepository.findAll();
    }
    
}
