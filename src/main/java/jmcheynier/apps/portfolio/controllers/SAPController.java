package jmcheynier.apps.portfolio.controllers;

import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import jmcheynier.apps.portfolio.models.SAP.conversationalAI.DialogRequest;
import jmcheynier.apps.portfolio.models.SAP.conversationalAI.Message;
import jmcheynier.apps.portfolio.models.SAP.conversationalAI.MessageText;
import jmcheynier.apps.portfolio.services.SAPService;



@RestController
@RequestMapping("/api/v2/sap")
public class SAPController {

	@Autowired
	SAPService SAPService;
	


	@GetMapping("/dialog/test")
	public String TEST() throws IOException {
		
		return "unplugged";

	}
	
	@PostMapping("/dialog/conversation/{convId}")
	public List<Message> dialog(@RequestBody MessageText messageText, @PathVariable String convId ) throws IOException {
		
		DialogRequest dialogRequest = new DialogRequest();
		dialogRequest.setMessage(messageText);
		dialogRequest.setConversationId(convId);
		
		return SAPService.sendDialogRequest(dialogRequest);

	}
	
	@PostMapping("/dialog")
	public List<Message> initDialog(@RequestBody MessageText messageText  ) throws IOException {
		
		DialogRequest dialogRequest = new DialogRequest();
		dialogRequest.setMessage(messageText);
		dialogRequest.setConversationId("123456");
		return SAPService.sendDialogRequest(dialogRequest);
	}



}