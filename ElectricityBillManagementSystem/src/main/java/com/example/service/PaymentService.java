package com.example.service;

import java.util.List;


import com.example.entity.Payment;

public interface PaymentService {
	
	public Payment addPayment(Payment p);

	public List<Payment> getAllPayments();

	public Payment getPaymentById(int id);

	public String deletePayment(int id);

	public Payment updatePayment(Payment p);

	//public List<Appointment> findPatientByName(String name);


}
