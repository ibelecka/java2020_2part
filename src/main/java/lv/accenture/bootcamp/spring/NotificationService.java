package lv.accenture.bootcamp.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class NotificationService {

	@Autowired
	@Qualifier("smsService")
	private NotificationChannel smsService;
	
	@Autowired
	@Qualifier("emailService")
	private NotificationChannel emailService;
	
	
	public void spamPerson(User user){
		
		smsService.notifyUser(user);
		emailService.notifyUser(user);
		
	}
}
