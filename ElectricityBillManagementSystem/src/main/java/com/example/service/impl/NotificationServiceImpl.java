package com.example.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.entity.Notification;
import com.example.repository.NotificationRepository;
import com.example.service.NotificationService;

@Service
public class NotificationServiceImpl implements NotificationService {

	@Autowired
	NotificationRepository notificationRepository;
	
	@Override
	public Notification addNotification(Notification n) {
		// TODO Auto-generated method stub
		return notificationRepository.save(n);
	}

	@Override
	public List<Notification> getAllNotifications() {
		// TODO Auto-generated method stub
		return notificationRepository.findAll();
	}

	@Override
	public Notification getNotificationById(int id) {
		// TODO Auto-generated method stub
		return notificationRepository.findById(id).get();
	}

	@Override
	public String deleteNotification(int id) {
		// TODO Auto-generated method stub
		notificationRepository.deleteById(id);
		return "Notification is deleted";
	}

	@Override
	public Notification updateNotification(Notification n) {
		// TODO Auto-generated method stub
		Notification _n=notificationRepository.findById(n.getNid()).get();
		
		_n.setNotice(n.getNotice());
		_n.setTimestamp(n.getTimestamp());
		return notificationRepository.save(n);
	}

}
