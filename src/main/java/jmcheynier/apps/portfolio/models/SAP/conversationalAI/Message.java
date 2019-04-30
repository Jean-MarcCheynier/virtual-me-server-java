package jmcheynier.apps.portfolio.models.SAP.conversationalAI;

public class Message extends jmcheynier.apps.portfolio.models.Message  {
	
	public Message(String type, String content) {
		this.setContent(content);
		this.setType(type);
	}

}
