package jmcheynier.apps.portfolio.models.SAP.conversationalAI;

import java.util.Map;

import com.fasterxml.jackson.annotation.JsonProperty;

public class DialogRequest {
	
	private MessageText message;
	@JsonProperty("conversation_id")
	private String conversationId;
	private String language;
	private Map<String, String> memory;
	
	
	public MessageText getMessage() {
		return message;
	}
	public void setMessage(MessageText message) {
		this.message = message;
	}
	public String getConversationId() {
		return conversationId;
	}
	public void setConversationId(String conversationId) {
		this.conversationId = conversationId;
	}
	public String getLanguage() {
		return language;
	}
	public void setLanguage(String language) {
		this.language = language;
	}
	public Map<String, String> getMemory() {
		return memory;
	}
	public void setMemory(Map<String, String> memory) {
		this.memory = memory;
	}
	
	

}
