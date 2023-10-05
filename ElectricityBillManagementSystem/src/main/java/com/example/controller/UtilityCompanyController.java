package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.entity.UtilityCompany;
import com.example.service.UtilityCompanyService;

@RestController
public class UtilityCompanyController {
	
	@Autowired
	UtilityCompanyService utilityCompanyService;
	
	
	@PostMapping("/utilityCompanys")
	public UtilityCompany addUtilityCompany(@RequestBody UtilityCompany uc) {
		return utilityCompanyService.addUtilityCompany(uc);
	}
	
	@GetMapping("/utilityCompanys")
	public List<UtilityCompany> getAllUtilityCompanys() {
		return utilityCompanyService.getAllUtilityCompanys();
	}
	
	@GetMapping("/utilityCompanys /{id}")
	public UtilityCompany getUtilityCompanyById(@PathVariable long id) {
		return utilityCompanyService.getUtilityCompanyById(id);
	}
	
	@DeleteMapping("/utilityCompanys /{id}")
	 public String deleteUtilityCompany(@PathVariable long id) {
		return utilityCompanyService.deleteUtilityCompany(id);
	}
	@PutMapping("/utilityCompanys")
	 public UtilityCompany updateUtilityCompany(@RequestBody UtilityCompany uc) {
		return utilityCompanyService.updateUtilityCompany(uc);
	}
}
