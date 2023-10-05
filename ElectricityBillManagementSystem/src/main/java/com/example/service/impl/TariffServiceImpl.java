package com.example.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.entity.Tariff;
import com.example.repository.TariffRepository;
import com.example.service.TariffService;

@Service
public class TariffServiceImpl implements TariffService{

	@Autowired
	TariffRepository tariffRepository;
	@Override
	public Tariff addTariff(Tariff t) {
		// TODO Auto-generated method stub
		return tariffRepository.save(t);
	}

	@Override
	public List<Tariff> getAllTariffs() {
		// TODO Auto-generated method stub
		return tariffRepository.findAll();
	}

	@Override
	public Tariff getTariffById(int id) {
		// TODO Auto-generated method stub
		return tariffRepository.findById(id).get();
	}

	@Override
	public String deleteTariff(int id) {
		// TODO Auto-generated method stub
		tariffRepository.deleteById(id);
		return "Tariff is deleted";
	}

	@Override
	public Tariff updateTariff(Tariff t) {
		// TODO Auto-generated method stub
		Tariff _t = tariffRepository.findById(t.getTid()).get();
		_t.setTariffcode(t.getTariffcode());
		_t.setService(t.getService());
		_t.setConnection(t.getConnection());
		_t.setCharge(t.getCharge());
		_t.setTariffExcluding(t.getTariffExcluding());
		_t.setSubsidy(t.getSubsidy());
		_t.setTariffPayable(t.getTariffPayable());
		return tariffRepository.save(t);
	}

}
