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

import com.example.entity.Consumer;
import com.example.service.ConsumerService;

@RestController
public class ConsumerController {
	
	@Autowired
	ConsumerService consumerService;
	
	@PostMapping("/consumers")
	public Consumer addConsumer(@RequestBody Consumer c){
		return consumerService.addConsumer(c);
		}
	@GetMapping("/consumers")
		public List<Consumer> getAllConsumers(){
		return consumerService.getAllConsumers();
		}
	@GetMapping("/consumers/{id}")
		public Consumer getConsumerById(@PathVariable long id) {
	    return consumerService.getConsumerById(id);
	
		}

	@DeleteMapping("/consumers/{id}")
		public String deleteConsumer(@PathVariable long id) {
	
		return consumerService.deleteConsumer(id);
		}

	@PutMapping("/consumers")
		public Consumer updateConsumer(@RequestBody Consumer c) {
		return consumerService.updateConsumer(c);

	}


}

