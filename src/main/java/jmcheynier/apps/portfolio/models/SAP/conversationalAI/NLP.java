package jmcheynier.apps.portfolio.models.SAP.conversationalAI;

import java.util.Date;
import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;

public class NLP {
	private String uuid;
	private List<Intent> intents;
	private Map<String, List<Map<String, String>>> entities;
	private String language;
	@JsonProperty("processing_language")
	private String processingLanguage;
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss.SSSXXX")
	private Date timestamp;
	private int status;
	private String source;
	private String act;
	private String type;
	private String sentiment;
	
	public String getUuid() {
		return uuid;
	}
	public void setUuid(String uuid) {
		this.uuid = uuid;
	}
	public List<Intent> getIntents() {
		return intents;
	}
	public void setIntents(List<Intent> intents) {
		this.intents = intents;
	}
	
	public Map<String, List<Map<String, String>>> getEntities() {
		return entities;
	}
	public void setEntities(Map<String, List<Map<String, String>>> entities) {
		this.entities = entities;
	}
	public String getLanguage() {
		return language;
	}
	public void setLanguage(String language) {
		this.language = language;
	}
	public String getProcessingLanguage() {
		return processingLanguage;
	}
	public void setProcessingLanguage(String processingLanguage) {
		this.processingLanguage = processingLanguage;
	}
	public Date getTimestamp() {
		return timestamp;
	}
	public void setTimestamp(Date timestamp) {
		this.timestamp = timestamp;
	}
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
	public String getSource() {
		return source;
	}
	public void setSource(String source) {
		this.source = source;
	}
	public String getAct() {
		return act;
	}
	public void setAct(String act) {
		this.act = act;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getSentiment() {
		return sentiment;
	}
	public void setSentiment(String sentiment) {
		this.sentiment = sentiment;
	}
	
	
	
}


