package com.example.service;

import java.util.List;

import com.example.entity.BillingParameter;

public interface BillingParameterService {

	public BillingParameter addBillingParameter(BillingParameter bill);

	public List<BillingParameter> getAllBillingParameters();

	public BillingParameter getBillingParameterById(long id);

	public String deleteBillingParameter(long id);

	public BillingParameter updateBillingParameter(BillingParameter bill);

	// public List<BillingParameter> findBillByNumber(String number);

}
