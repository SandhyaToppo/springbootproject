package com.example.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.entity.Consumer;
import com.example.repository.ConsumerRepository;
import com.example.service.ConsumerService;

@Service
public class ConsumerServiceImpl implements ConsumerService{

	@Autowired
	ConsumerRepository consumerRepository;

	@Override
	public Consumer addConsumer(Consumer c) {
		// TODO Auto-generated method stub
		return consumerRepository.save(c);
	}

	@Override
	public List<Consumer> getAllConsumers() {
		// TODO Auto-generated method stub
		return consumerRepository.findAll();
	}

	@Override
	public Consumer getConsumerById(long id) {
		// TODO Auto-generated method stub
		return consumerRepository.findById(id).get();
	}

	@Override
	public String deleteConsumer(long id) {
		// TODO Auto-generated method stub
		consumerRepository.deleteById(id);
		return "Consumer is deleted";
	}

	@Override
	public Consumer updateConsumer(Consumer c) {
		// TODO Auto-generated method stub
		Consumer _cr=consumerRepository.findById(c.getCid()).get(); 
		_cr.setCnumber(c.getCnumber());
		_cr.setName(c.getName());
		_cr.setFathername(c.getFathername());
		_cr.setContact(c.getContact());
		_cr.setAddress(c.getAddress());
		return consumerRepository.save(c);
	}
	
}
