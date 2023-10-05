package com.example.service;

import java.util.List;

import com.example.entity.Notification;



public interface NotificationService {
	
	public Notification addNotification(Notification n);

	public List<Notification> getAllNotifications();

	public Notification getNotificationById(int id);

	public String deleteNotification(int id);

	public Notification updateNotification(Notification n);

	//public List<Appointment> findPatientByName(String name);


}
