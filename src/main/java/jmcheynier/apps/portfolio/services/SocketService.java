package jmcheynier.apps.portfolio.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.simp.SimpMessagingTemplate;
import org.springframework.stereotype.Service;

import jmcheynier.apps.portfolio.models.SAP.conversationalAI.Message;

@Service
public class SocketService {
	
	@Autowired
	private SimpMessagingTemplate messagingTemplate;
	
	public void sendPrivateMessage(String to, Message message) {
		messagingTemplate.convertAndSend("/subscribe/private/" + to, message);	
	}
	
	public void sendPrivateMultiple(String to, List<Message> messageList) {
		for(Message message : messageList) {
			sendPrivateMessage(to, message);
		}
		
	}

}
