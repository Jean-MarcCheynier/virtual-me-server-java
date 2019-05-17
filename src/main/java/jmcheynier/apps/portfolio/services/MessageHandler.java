package jmcheynier.apps.portfolio.services;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import jmcheynier.apps.portfolio.models.SAP.conversationalAI.DialogRequest;
import jmcheynier.apps.portfolio.models.SAP.conversationalAI.Message;
import jmcheynier.apps.portfolio.models.SAP.conversationalAI.MessageText;

@Service
public class MessageHandler {
	
	
	@Autowired
	SAPService SAPService;
	
	@Autowired
	SocketService socketService;
	
	private List<String> channelList = new ArrayList<String>();
	
	public void SAPCAIDialog(String sessionId, jmcheynier.apps.portfolio.models.Message message) {
		MessageText mIn = new MessageText(message);
		socketService.sendPrivateMessage(message.getTo(), mIn);
		
		DialogRequest dialogRequest = new DialogRequest();

	    dialogRequest.setConversationId(sessionId);
	    dialogRequest.setMessage(mIn);
	    List<Message> mOutList = null;

		mOutList = SAPService.sendDialogRequestV2(dialogRequest);

		if( mOutList != null && !mOutList.isEmpty()) {
			socketService.sendPrivateMultiple(message.getTo(), mOutList);
    	}
	
	}
	
	public void SAPCAIDialog2(String sessionId, jmcheynier.apps.portfolio.models.Message message) {
		MessageText mIn = new MessageText(message);
		socketService.sendPrivateMessageText(message.getTo(), "0");
		
		DialogRequest dialogRequest = new DialogRequest();

	    dialogRequest.setConversationId(sessionId);
	    dialogRequest.setMessage(mIn);

		SAPService.sendDialogRequestV3(message.getTo(), dialogRequest);

		
		socketService.sendPrivateMessageText(message.getTo(), "6");
	}
}
    

