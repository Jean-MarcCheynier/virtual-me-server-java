package jmcheynier.apps.portfolio.controllers;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.simp.SimpMessagingTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import jmcheynier.apps.portfolio.models.Message;
import jmcheynier.apps.portfolio.services.SAPService;



@RestController
@RequestMapping("/api/v1/test")
public class TestController {

	@Autowired
	SAPService SAPService;
	
	@Autowired
    private SimpMessagingTemplate simpMessagingTemplate;


	@GetMapping("/socket")
	public String TEST() throws IOException {
		this.simpMessagingTemplate.convertAndSend("/socket-publisher",new Message("test"));
		return "done";

	}



}
