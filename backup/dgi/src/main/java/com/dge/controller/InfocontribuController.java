package com.dge.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.dge.dto.InfoContribu;
import com.dge.exception.ExceptionEntity;
import com.dge.models.Enterprise;
import com.dge.service.InfocontribuService;

@RestController
@RequestMapping("api/v1/info")
public class InfocontribuController {
    private final InfocontribuService infocontribuService;
    @Autowired
    public InfocontribuController(InfocontribuService infocontribuService) {
        this.infocontribuService = infocontribuService;
    }

    @GetMapping
    public List<Enterprise> getinfo(){
        return infocontribuService.find();
    }
    @PostMapping
    public ResponseEntity<Object>  insert(@RequestBody InfoContribu infoContribu) throws Exception{
        try {
                Enterprise  result = infocontribuService.insert(infoContribu); 
                return new ResponseEntity<>(result, HttpStatus.OK);
        }  catch (Exception e) {
            return new ResponseEntity<>(new ExceptionEntity(e), HttpStatus.BAD_REQUEST);
        }
    }
}
