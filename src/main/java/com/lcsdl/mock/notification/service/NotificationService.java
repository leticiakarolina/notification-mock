package com.lcsdl.mock.notification.service;

import java.util.concurrent.ThreadLocalRandom;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import com.lcsdl.mock.notification.dto.NotificationDTO;

@Service
public class NotificationService {

	public NotificationDTO sendNotification() {
		boolean isSuccess = ThreadLocalRandom.current().nextBoolean();
		
		if(isSuccess) {
			return new NotificationDTO(HttpStatus.OK.value(), "success");
		}
		else {
			return new NotificationDTO(HttpStatus.INTERNAL_SERVER_ERROR.value(), "failed");
		}

	}
	
}
