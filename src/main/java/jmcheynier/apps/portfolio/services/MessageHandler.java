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
		try {
			mOutList = SAPService.sendDialogRequestV2(dialogRequest);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if( mOutList != null && !mOutList.isEmpty()) {
			socketService.sendPrivateMultiple(message.getTo(), mOutList);
    	}
	
	}
}
    

