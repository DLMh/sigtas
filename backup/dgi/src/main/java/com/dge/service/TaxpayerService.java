package com.dge.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dge.exception.TaxpayerNotExistException;
import com.dge.models.Taxpayer;
import com.dge.repository.TaxpayerRepository;



@Service
public class TaxpayerService {
    private final TaxpayerRepository taxpayerRepository;

    @Autowired
    public TaxpayerService(TaxpayerRepository taxpayerRepository) {
        this.taxpayerRepository = taxpayerRepository;
    }

    public Taxpayer findByNif(String nif) throws TaxpayerNotExistException {
        Optional<Taxpayer> result = taxpayerRepository.findbyNif(nif);
        if(!result.isPresent())
          throw new TaxpayerNotExistException("il n'y a pas de contribuable qui correspond a ce NIF!!");
        return result.get();
      }
    public List<Taxpayer> getTaxpayer(){
        return taxpayerRepository.findAll();
    }
}
