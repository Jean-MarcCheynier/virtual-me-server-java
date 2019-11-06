package jmcheynier.apps.portfolio.models.SAP.conversationalAI;

public class MessageQuickReplies extends Message{
	
	private MultipleChoice content;
	
	public MessageQuickReplies() {
		super();
	}

	public MultipleChoice getContent() {
		return content;
	}

	public void setContent(MultipleChoice content) {
		this.content = content;
	}

}
