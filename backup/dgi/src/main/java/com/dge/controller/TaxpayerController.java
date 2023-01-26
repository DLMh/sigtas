package com.dge.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.dge.exception.ExceptionEntity;
import com.dge.exception.TaxpayerNotExistException;
import com.dge.models.Taxpayer;
import com.dge.service.TaxpayerService;

@RestController
@RequestMapping("api/v1/taxpayer")
public class TaxpayerController {
    private final TaxpayerService taxpayerService;

    @Autowired
    public TaxpayerController(TaxpayerService taxpayerService) {
        this.taxpayerService = taxpayerService;
    }

    @GetMapping
    public List<Taxpayer> getTaxpayer(){
		return taxpayerService.getTaxpayer();
    }
    @GetMapping("/verify")
	public ResponseEntity<Object> findByNif(@RequestParam(required = false) String nif) {
		try {
			return new ResponseEntity<>(taxpayerService.findByNif(nif), HttpStatus.OK);
		} catch (TaxpayerNotExistException e) {
			return new ResponseEntity<>(new ExceptionEntity(e), HttpStatus.OK);
		}
	}
}
