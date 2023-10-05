package com.example.service;

import java.util.List;


import com.example.entity.MeterDetails;

public interface MeterDetailsService {
	
	public MeterDetails addMeterDetails(MeterDetails md);

	public List<MeterDetails> getAllMeterDetails();

	public MeterDetails getMeterDetailsById(long id);

	public String deleteMeterDetails(long id);

	public MeterDetails updateMeterDetails(MeterDetails md);

	//public List<MeterDetails> findPatientByName(String name);


}
