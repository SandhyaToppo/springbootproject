package com.example.service;

import java.util.List;

import com.example.entity.Complaint;

public interface ComplaintService {
	
	public Complaint addComplaint(Complaint c);

	public List<Complaint> getAllComplaints();

	public Complaint getComplaintById(int id);

	public String deleteComplaint(int id);

	public Complaint updateComplaint(Complaint c);

	//public List<Complaints> findConsumerByName(String name);


}
