package jmcheynier.apps.portfolio.controllers;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.simp.SimpMessagingTemplate;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.databind.ObjectMapper;

import jmcheynier.apps.portfolio.models.SAP.conversationalAI.DialogRequest;
import jmcheynier.apps.portfolio.models.SAP.conversationalAI.IMessage;
import jmcheynier.apps.portfolio.models.SAP.conversationalAI.Message;
import jmcheynier.apps.portfolio.models.SAP.conversationalAI.MessageButton;
import jmcheynier.apps.portfolio.models.SAP.conversationalAI.MessageText;
import jmcheynier.apps.portfolio.services.SAPService;

@RestController
@RequestMapping(value = "/api/v1/socket")
@CrossOrigin("*")
public class MessageHandlerController {
	
	@Autowired
    private SimpMessagingTemplate simpMessagingTemplate;
	
	@Autowired
	private SAPService SAPService;

    @RequestMapping(method = RequestMethod.POST)
    public ResponseEntity<?> useSimpleRest(@RequestBody  Map<String, String> message){
        if(message.containsKey("message")){
        	//if the toId is present the message will be sent privately else broadcast it to all users
            if(message.containsKey("toId") && message.get("toId")!=null && !message.get("toId").equals("")){
                this.simpMessagingTemplate.convertAndSend("/socket-publisher/"+message.get("toId"),message);
                this.simpMessagingTemplate.convertAndSend("/socket-publisher/"+message.get("fromId"),message);
            }else{
                this.simpMessagingTemplate.convertAndSend("/socket-publisher",message);
            }
            return new ResponseEntity<>(message, new HttpHeaders(), HttpStatus.OK);
        }
        return new ResponseEntity<>(new HttpHeaders(), HttpStatus.BAD_REQUEST);
    }

    @MessageMapping("/send/message")
    public Map<String, String> useSocketCommunication(String message){
        ObjectMapper mapper = new ObjectMapper();
        Map<String, String> messageConverted = null;
        try {
            messageConverted = mapper.readValue(message, Map.class);
        } catch (IOException e) {
            messageConverted = null;
        }
        if(messageConverted!=null){
            if(messageConverted.containsKey("toId") && messageConverted.get("toId")!=null && !messageConverted.get("toId").equals("")){
                this.simpMessagingTemplate.convertAndSend("/socket-publisher/"+messageConverted.get("toId"),messageConverted);
                this.simpMessagingTemplate.convertAndSend("/socket-publisher/"+messageConverted.get("fromId"),message);
            }else{
                this.simpMessagingTemplate.convertAndSend("/socket-publisher",messageConverted);
                DialogRequest dialogRequest = new DialogRequest();
                MessageText messageIn = new MessageText("text", messageConverted.get("content"));
                dialogRequest.setConversationId("test");
                dialogRequest.setMessage(messageIn);
                String response;
                
                List<Message> messagesQueue = null;
				try {
					messagesQueue = SAPService.sendDialogRequestV2(dialogRequest);
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
					response = "error";
				}
				
				if( messagesQueue != null && !messagesQueue.isEmpty()) {
					for(Message m : messagesQueue) {
						if(m instanceof MessageText){
							m = (MessageText) m;
						}else if(m instanceof MessageButton) {
							m = (MessageText) m;
						}
						this.simpMessagingTemplate.convertAndSend("/socket-publisher/"+messageConverted.get("fromId"),m);
					}
            	}
                
                
              
            }
        }
        return messageConverted;
    }
}
