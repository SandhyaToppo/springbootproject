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

import com.example.entity.Complaint;
import com.example.service.ComplaintService;



@RestController
public class ComplaintController {
	
	
	@Autowired
	ComplaintService complaintService;
	
	@PostMapping("/complaints")
	public Complaint addComplaints(@RequestBody Complaint c) {
		return complaintService.addComplaint(c);
	}
	
	@GetMapping("/complaints")
	public List<Complaint> getAllComplaints() {
		return complaintService.getAllComplaints();
	}
	@GetMapping("/complaints /{id}")
	public Complaint getComplaintById(@PathVariable int id) {
		return complaintService.getComplaintById(id);
	}
	
	@DeleteMapping("/complaints /{id}")
	public String deleteComplaint(@PathVariable int id) {
		return complaintService.deleteComplaint(id);
	}
	
	@PutMapping("/complaints")
	public Complaint updateComplaint(@RequestBody Complaint c) {
		return complaintService.updateComplaint(c);
		
	}
	
}
