package jmcheynier.apps.portfolio.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.simp.SimpMessagingTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;




@Controller
public class TestController {
	
	@Autowired
	private SimpMessagingTemplate template;
	
	
	@RequestMapping(value = "/test", method = RequestMethod.GET)
	@ResponseBody
    public void sendTo() throws Exception {
    	System.out.println("Calling greetings from request");
    	this.template.convertAndSend("/topic/greetings", "Hello!");  
    }



}
