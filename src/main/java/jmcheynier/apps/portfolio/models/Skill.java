package jmcheynier.apps.portfolio.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import jmcheynier.apps.portfolio.models.enums.LevelCode;

@Entity
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Skill {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private LevelCode level;
	
	private String type;
	private String description;
	private String name;
	private String value;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public LevelCode getLevel() {
		return level;
	}
	public void setLevel(LevelCode level) {
		this.level = level;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getValue() {
		return value;
	}
	public void setValue(String value) {
		this.value = value;
	}


	

}
