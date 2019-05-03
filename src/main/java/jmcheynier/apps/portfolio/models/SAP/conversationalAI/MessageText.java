package jmcheynier.apps.portfolio.models.SAP.conversationalAI;

public class MessageText extends Message {
	

	public String content;
	
	public MessageText() {
		super();
	}
	
	public MessageText(String type, String content) {
		super();
		this.setContent(content);
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}



}
