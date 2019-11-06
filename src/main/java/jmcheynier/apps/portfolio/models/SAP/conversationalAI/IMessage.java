package jmcheynier.apps.portfolio.models.SAP.conversationalAI;

public interface IMessage<T> {
	public String getType();
	public void setType(String type);
	public T getContent();
	public void setContent(T content);
}
