package com.example.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.entity.BillingParameter;
import com.example.repository.BillingParameterRepository;

import com.example.service.BillingParameterService;

@Service
public class BillingParameterServiceImpl implements BillingParameterService {

	@Autowired
	BillingParameterRepository billingParameterRepository;
//	@Autowired
//	ConsumerRepository consumerRepository;

	@Override
	public BillingParameter addBillingParameter(BillingParameter bill) {
		// TODO Auto-generated method stub
		// Consumer _cr = billingParameterRepository.findById(bill.getBid()).get();
		// bill.setCr(_cr);
		return billingParameterRepository.save(bill);
	}

	@Override
	public List<BillingParameter> getAllBillingParameters() {
		// TODO Auto-generated method stub
		return billingParameterRepository.findAll();
	}

	@Override
	public BillingParameter getBillingParameterById(long id) {
		// TODO Auto-generated method stub
		return billingParameterRepository.findById(id).get();
	}

	@Override
	public String deleteBillingParameter(long id) {
		// TODO Auto-generated method stub
		billingParameterRepository.deleteById(id);
		return "BillingParameter is deleted";
	}

	@Override
	public BillingParameter updateBillingParameter(BillingParameter bill) {
		// TODO Auto-generated method stub
		BillingParameter _bill = billingParameterRepository.findById(bill.getBid()).get();
		_bill.setBillNumber(bill.getBillNumber());
		_bill.setBillMonth(bill.getBillMonth());
		_bill.setBillIssueDate(bill.getBillIssueDate());
		_bill.setDuedate(bill.getDuedate());
		_bill.setDateOfCurrentReading(bill.getDateOfCurrentReading());
		_bill.setCurrentKWH(bill.getCurrentKWH());
		_bill.setDateOfPrevReading(bill.getDateOfPrevReading());
		_bill.setPrevKWH(bill.getPrevKWH());
		_bill.setDifferenceKWHXMF(bill.getDifferenceKWHXMF());
		_bill.setPeriod(bill.getPeriod());
		_bill.setTotalAssessment(bill.getTotalAssessment());

		return billingParameterRepository.save(bill);
	}

//	@Override
//	public List<BillingParameter> findBillByNumber(String number) {
//		// TODO Auto-generated method stub
//		return billingParameterRepository.findBillByNumber(number);
//	}

}
