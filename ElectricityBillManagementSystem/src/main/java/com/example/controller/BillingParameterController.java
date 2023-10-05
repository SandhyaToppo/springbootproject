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

import com.example.entity.BillingParameter;
import com.example.service.BillingParameterService;

@RestController
public class BillingParameterController {

	@Autowired
	BillingParameterService billingParameterService;

	@PostMapping("/billingParameters")
	public BillingParameter addBillingParameter(@RequestBody BillingParameter bill) {
		return billingParameterService.addBillingParameter(bill);

	}

//	@GetMapping("/billingParameters /{bnumber}")
//	public List<BillingParameter> getBillingParameterByBillNumber(@PathVariable String bnumber) {
//		return billingParameterService.findBillByNumber(bnumber);
//
//	}

	@GetMapping("/billingParameters")
	public List<BillingParameter> getAllBillingParameter() {
		return billingParameterService.getAllBillingParameters();
	}

	@GetMapping("/billingParameters/{id}")
	public BillingParameter getBillingParameterById(@PathVariable long id) {
		return billingParameterService.getBillingParameterById(id);
	}

	@DeleteMapping("/billingParameters/{id}")
	public String deleteBillingParameter(@PathVariable long id) {
		return billingParameterService.deleteBillingParameter(id);

	}

	@PutMapping("/billingParameters")
	public BillingParameter updateBillingParameter(@RequestBody BillingParameter bill) {
		return billingParameterService.updateBillingParameter(bill);

	}

}
