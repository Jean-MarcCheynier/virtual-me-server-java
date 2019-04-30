package jmcheynier.apps.portfolio.models;

public class Message {
	
	private String content;
	private String type;
	
	public Message() {
	}
	
	public Message(String content) {
		this.content = content;
	}
	
	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
	
	
	
	

}
