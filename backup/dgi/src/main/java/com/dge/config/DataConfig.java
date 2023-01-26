package com.dge.config;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.dge.models.Division;
import com.dge.models.Enterprise;
import com.dge.models.Ird_employee;
import com.dge.models.Sector_activity;
import com.dge.models.Taxpayer;
import com.dge.repository.DivisionRepository;
import com.dge.repository.EnterpriseRepository;
import com.dge.repository.Ird_employeeRepository;
import com.dge.repository.Sector_activityRepository;
import com.dge.repository.TaxpayerRepository;


@Configuration
public class DataConfig {
	
	@Bean
	CommandLineRunner SectorCommandRunner(Sector_activityRepository r) {
		return args -> {
			Sector_activity s=new Sector_activity("Industriel","Industriel","Industriel");
			r.saveAll(List.of(s));			
		};
	}
	@Bean
	CommandLineRunner DivisionCommandRunner(DivisionRepository r) {
		return args -> {
			Division d=new Division("GESTION","SERVICE GESTION","SERVICE GESTION");
			r.saveAll(List.of(d));			
		};
	}
	@Bean
	CommandLineRunner IrdempCommandRunner(Ird_employeeRepository r) {
		return args -> {
			Ird_employee i=new Ird_employee("234-996","ELEONORE","RAZAIARIMALALA","RELEONORE",(long)1,(long)2,(long)1,"N","N",null,null);
			r.saveAll(List.of(i));			
		};
	}
	@Bean
	CommandLineRunner TaxpayerCommandRunner(TaxpayerRepository r) {
		return args -> {
			Taxpayer t=new Taxpayer("0111111", "iavoloha");
			r.saveAll(List.of(t));			
		};
	}
	@Bean
	CommandLineRunner EnterpriseCommandRunner(EnterpriseRepository r) {
		return args -> {
			Enterprise e =new Enterprise("Iav 306","0341185694","DL Corporation");
			r.saveAll(List.of(e));			
		};
	}
}
