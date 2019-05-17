package jmcheynier.apps.portfolio.models.SAP.conversationalAI;

public class MessageText extends Message {
	

	public String content;
	
	public MessageText() {
		super();
	}
	
	public MessageText(jmcheynier.apps.portfolio.models.Message m) {
		super();
		this.setContent(m.getContent());
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}



}
