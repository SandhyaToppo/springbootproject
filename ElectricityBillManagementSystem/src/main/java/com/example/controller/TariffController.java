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

import com.example.entity.Tariff;
import com.example.service.TariffService;

@RestController
public class TariffController {
	
	@Autowired
	TariffService tariffService;
	
	@PostMapping("/tariffs")
	public Tariff addTariff(@RequestBody Tariff t) {
		return tariffService.addTariff(t);
		
	}
	@GetMapping("/tariffs")
	public List<Tariff> getAllTariffs(){
		return tariffService.getAllTariffs();
		
	}
	@GetMapping("/tariffs /{id}")
	public Tariff getTariffById(@PathVariable int id) {
		return tariffService.getTariffById(id);
	}
	
	@DeleteMapping("/tariffs /{id}")
	public String deleteTariff(@PathVariable int id) {
		return tariffService.deleteTariff(id);
		
	}
	@PutMapping("/tariffs")
	public Tariff updateTariff(@RequestBody Tariff t) {
		return tariffService.updateTariff(t);
		
	}
	

}
	
