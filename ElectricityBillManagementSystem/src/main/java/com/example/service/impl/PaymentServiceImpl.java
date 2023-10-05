package com.example.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.entity.Payment;
import com.example.repository.PaymentRepository;
import com.example.service.PaymentService;

@Service
public class PaymentServiceImpl implements PaymentService{
	
	@Autowired
	PaymentRepository paymentRepository;

	@Override
	public Payment addPayment(Payment p) {
		// TODO Auto-generated method stub
		return paymentRepository.save(p);
	}

	@Override
	public List<Payment> getAllPayments() {
		// TODO Auto-generated method stub
		return paymentRepository.findAll();
	}

	@Override
	public Payment getPaymentById(int id) {
		// TODO Auto-generated method stub
		return paymentRepository.findById(id).get();
	}

	@Override
	public String deletePayment(int id) {
		// TODO Auto-generated method stub
		paymentRepository.deleteById(id);
		return "payment is deleted";
	}

	@Override
	public Payment updatePayment(Payment p) {
		// TODO Auto-generated method stub
		Payment _p=paymentRepository.findById(p.getPid()).get();
		_p.setPaymentDate(p.getPaymentDate());
		_p.setCurrentPaymentAmount(p.getCurrentPaymentAmount());
		_p.setLastPaymentAmount(p.getLastPaymentAmount());
		_p.setBeneficiaryName(p.getBeneficiaryName());
		_p.setBankName(p.getBankName());
		_p.setPaymentMethod(p.getPaymentMethod());
		return paymentRepository.save(p);
	}

}
