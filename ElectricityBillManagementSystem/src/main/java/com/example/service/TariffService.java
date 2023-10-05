package com.example.service;

import java.util.List;

import com.example.entity.Tariff;


public interface TariffService {
	
	public Tariff addTariff(Tariff t);

	public List<Tariff> getAllTariffs();

	public Tariff getTariffById(int id);

	public String deleteTariff(int id);

	public Tariff updateTariff(Tariff t);

	//public List<Appointment> findPatientByName(String name);


}
