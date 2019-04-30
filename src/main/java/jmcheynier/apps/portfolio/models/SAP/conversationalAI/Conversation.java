package jmcheynier.apps.portfolio.models.SAP.conversationalAI;

import java.util.Map;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Conversation {
	
	private String id;
	private String language;
	private Map<String, Object> memory;
	private String skill;
	@JsonProperty("skill_occurences")
	private int skillOccurences;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getLanguage() {
		return language;
	}
	public void setLanguage(String language) {
		this.language = language;
	}
	public Map<String, Object> getMemory() {
		return memory;
	}
	public void setMemory(Map<String, Object> memory) {
		this.memory = memory;
	}
	public String getSkill() {
		return skill;
	}
	public void setSkill(String skill) {
		this.skill = skill;
	}
	public int getSkillOccurences() {
		return skillOccurences;
	}
	public void setSkillOccurences(int skillOccurences) {
		this.skillOccurences = skillOccurences;
	}
	
	
}
