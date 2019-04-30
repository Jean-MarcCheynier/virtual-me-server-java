package jmcheynier.apps.portfolio.models.SAP.conversationalAI;

import java.util.List;

public class Results {
	private NLP nlp;
	private QNA qna;
	private List<Message> messages;
	private Conversation conversation;
	public NLP getNlp() {
		return nlp;
	}
	public void setNlp(NLP nlp) {
		this.nlp = nlp;
	}
	public QNA getQna() {
		return qna;
	}
	public void setQna(QNA qna) {
		this.qna = qna;
	}
	public List<Message> getMessages() {
		return messages;
	}
	public void setMessages(List<Message> messages) {
		this.messages = messages;
	}
	public Conversation getConversation() {
		return conversation;
	}
	public void setConversation(Conversation conversation) {
		this.conversation = conversation;
	}
	
	
}
