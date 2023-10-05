package com.example.service;

import java.util.List;

import com.example.entity.UtilityCompany;



public interface UtilityCompanyService {
	
	public UtilityCompany addUtilityCompany(UtilityCompany uc);

	public List<UtilityCompany> getAllUtilityCompanys();

	public UtilityCompany getUtilityCompanyById(long id);

	public String deleteUtilityCompany(long id);

	public UtilityCompany updateUtilityCompany(UtilityCompany uc);

	
	//public List<UtilityCompany> findPatientByName(String name);

	
	

}
