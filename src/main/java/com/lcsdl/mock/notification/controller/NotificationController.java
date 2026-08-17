package com.lcsdl.mock.notification.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lcsdl.mock.notification.dto.NotificationDTO;
import com.lcsdl.mock.notification.service.NotificationService;

@RestController
public class NotificationController {
	
	private final NotificationService notificationService;
	
	public NotificationController(NotificationService notificationService) {
		this.notificationService = notificationService;
	}
	
	@PostMapping("/send")
	public ResponseEntity<NotificationDTO> sendNotification(){
		return ResponseEntity.ok(notificationService.sendNotification());
	}
	

}
