package jmcheynier.apps.portfolio.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.simp.SimpMessagingTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import jmcheynier.apps.portfolio.models.Action;
import jmcheynier.apps.portfolio.services.SocketService;




@Controller
@RequestMapping("/api/socket")
public class WebSocketApiController {
	
	@Autowired
	private SimpMessagingTemplate template;
	@Autowired
	private WebSocketController webSocketController;
	
	@Autowired
	private SocketService socketService;
	
	
	@RequestMapping(value = "/action", method = RequestMethod.POST)
	@ResponseBody
    public void triggerAction(@RequestBody Action action) throws Exception {
    	System.out.println("Calling greetings from request");
    	socketService.sendPrivateMessage("123456", action);
    	webSocketController.triggerActionToUser("123456", action);  
    }



}
