package jmcheynier.apps.portfolio.models.SAP.conversationalAI;

public class MessageButton extends Message{

	private MultipleChoice content;
	
	public MessageButton() {
		super();
	}

	public MultipleChoice getContent() {
		return content;
	}

	public void setContent(MultipleChoice content) {
		this.content = content;
	}
}
