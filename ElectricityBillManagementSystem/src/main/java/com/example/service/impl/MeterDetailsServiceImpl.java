package com.example.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.entity.MeterDetails;
import com.example.repository.MeterDetailsRepository;
import com.example.service.MeterDetailsService;

@Service
public class MeterDetailsServiceImpl implements MeterDetailsService{

	@Autowired
	MeterDetailsRepository meterDetailsRepository;
	
	@Override
	public MeterDetails addMeterDetails(MeterDetails md) {
		// TODO Auto-generated method stub
		return meterDetailsRepository.save(md);
	}

	@Override
	public List<MeterDetails> getAllMeterDetails() {
		// TODO Auto-generated method stub
		return meterDetailsRepository.findAll();
	}

	@Override
	public MeterDetails getMeterDetailsById(long id) {
		// TODO Auto-generated method stub
		return meterDetailsRepository.findById(id).get();
	}

	@Override
	public String deleteMeterDetails(long id) {
		// TODO Auto-generated method stub
		meterDetailsRepository.deleteById(id);
		return "MeterDetails is deleted";
	}

	@Override
	public MeterDetails updateMeterDetails(MeterDetails md) {
		// TODO Auto-generated method stub
		MeterDetails _md=meterDetailsRepository.findById(md.getMid()).get();
		_md.setMeterOwner(md.getMeterOwner());
		_md.setMeterType(md.getMeterType());
		_md.setMeterstatus(md.getMeterstatus());
		_md.setPhase(md.getPhase());
		_md.setUnitConsumed(md.getUnitConsumed());
		_md.setInstallationdate(md.getInstallationdate());
		return meterDetailsRepository.save(md);
	}

}
