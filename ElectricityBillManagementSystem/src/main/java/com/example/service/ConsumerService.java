package com.example.service;

import java.util.List;

import com.example.entity.Consumer;


//import com.example.ExceptionHandling.DoctorNotFoundException;

public interface ConsumerService {
	
	public Consumer addConsumer(Consumer c);

	public List<Consumer> getAllConsumers();

	public Consumer getConsumerById(long id); //throws ConsumerNotFoundException;

	public String deleteConsumer(long id);

	public Consumer updateConsumer(Consumer c);


}
