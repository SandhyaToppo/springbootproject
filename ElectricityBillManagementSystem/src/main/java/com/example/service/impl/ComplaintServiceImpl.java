package com.example.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.entity.Complaint;

import com.example.repository.ComplaintRepository;

import com.example.service.ComplaintService;

@Service
public class ComplaintServiceImpl implements ComplaintService{

	
	@Autowired
	ComplaintRepository complaintRepository;
	@Override
	public Complaint addComplaint(Complaint c) {
		// TODO Auto-generated method stub
		return complaintRepository.save(c) ;
	}

	@Override
	public List<Complaint> getAllComplaints() {
		// TODO Auto-generated method stub
		return complaintRepository.findAll();
	}

	@Override
	public Complaint getComplaintById(int id) {
		// TODO Auto-generated method stub
		return complaintRepository.findById(id).get();
	}

	@Override
	public String deleteComplaint(int id) {
		// TODO Auto-generated method stub
		complaintRepository.deleteById(id);
		return "Complaints is deleted";
	}

	@Override
	public Complaint updateComplaint(Complaint c) {
		// TODO Auto-generated method stub
		Complaint _c = complaintRepository.findById(c.getCompid()).get();
		_c.setComplainttopic(c.getComplainttopic());
		_c.setDescription(c.getDescription());
		return complaintRepository.save(c);
	}

}
