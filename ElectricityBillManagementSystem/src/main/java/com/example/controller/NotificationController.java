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

import com.example.entity.Notification;
import com.example.service.NotificationService;

@RestController
public class NotificationController {
	
	@Autowired
	NotificationService notificationService;
	
	@PostMapping("/notifications")
	public Notification addNotification(@RequestBody Notification n) {
		return notificationService.addNotification(n);
		
	}
	@GetMapping("/notifications ")
	public List<Notification> GetAllNotification(){
		return notificationService.getAllNotifications();
	}

	@GetMapping("/notifications /{id}")
	public Notification getNotificationById(@PathVariable int id) {
		return notificationService.getNotificationById(id);
		
	}
	@DeleteMapping("/notifications /{id}")
	public String deleteNotification(@PathVariable int id) {
		return notificationService.deleteNotification(id);
		
	}
	
	@PutMapping("/notifications")
	public Notification updateNotification(@RequestBody Notification n) {
		return notificationService.updateNotification(n);
		
	}
}
