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

import com.example.entity.MeterDetails;
import com.example.service.MeterDetailsService;

@RestController
public class MeterDetailsController {
	
	@Autowired
	MeterDetailsService meterDetailsService;
	
	@PostMapping("/meterDetails")
	public MeterDetails addMeterDetails(@RequestBody MeterDetails md) {
	return meterDetailsService.addMeterDetails(md);
	}
	
	@GetMapping("/meterDetails")
	public List<MeterDetails> getAllMeterDetails(){
		return  meterDetailsService.getAllMeterDetails();
	}
	
	@GetMapping("/meterDetails /{id}")
	public MeterDetails getMeterDetailsById(@PathVariable long id) {
		return meterDetailsService.getMeterDetailsById(id);
		
	}
	@DeleteMapping("/meterDetails /{id}")
	public String deleteMeterDetails(@PathVariable long id) {
		return meterDetailsService.deleteMeterDetails(id);
		
	}
	@PutMapping("/meterDetails")
	public MeterDetails updateMaterDetails(@RequestBody MeterDetails md) {
		return meterDetailsService.updateMeterDetails(md);
		
	}
}
