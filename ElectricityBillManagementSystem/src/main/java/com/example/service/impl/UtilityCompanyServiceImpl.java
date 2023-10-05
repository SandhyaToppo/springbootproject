package com.example.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.entity.UtilityCompany;
import com.example.repository.UtilityCompanyRepository;
import com.example.service.UtilityCompanyService;

@Service
public class UtilityCompanyServiceImpl implements UtilityCompanyService{

	@Autowired
	UtilityCompanyRepository utilityCompanyRepository;
	@Override
	public UtilityCompany addUtilityCompany(UtilityCompany uc) {
		// TODO Auto-generated method stub
		return utilityCompanyRepository.save(uc);
	}

	@Override
	public List<UtilityCompany> getAllUtilityCompanys() {
		// TODO Auto-generated method stub
		return utilityCompanyRepository.findAll();
	}

	@Override
	public UtilityCompany getUtilityCompanyById(long id) {
		// TODO Auto-generated method stub
		return utilityCompanyRepository.findById(id).get();
	}

	@Override
	public String deleteUtilityCompany(long id) {
		// TODO Auto-generated method stub
		utilityCompanyRepository.deleteById(id);
		return "UtilityCompany is deleted";
	}

	@Override
	public UtilityCompany updateUtilityCompany(UtilityCompany uc) {
		// TODO Auto-generated method stub
		UtilityCompany _uc = utilityCompanyRepository.findById(uc.getUid()).get();
		_uc.setCompanyName(uc.getCompanyName());
		_uc.setContactEmail(uc.getContactEmail());
		_uc.setContactNo(uc.getContactNo());
		_uc.setAddress(uc.getAddress());
		_uc.setCity(uc.getCity());
		_uc.setState(uc.getState());
		_uc.setPostalCode(uc.getPostalCode());
		_uc.setCountry(uc.getCountry());
		return utilityCompanyRepository.save(uc);
	}

}
