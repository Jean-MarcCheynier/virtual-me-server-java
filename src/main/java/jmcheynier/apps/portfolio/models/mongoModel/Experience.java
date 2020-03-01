package jmcheynier.apps.portfolio.models.mongoModel;

import java.util.Date;
import java.util.HashMap;
import java.util.List;

import org.springframework.data.annotation.Id;

import com.fasterxml.jackson.annotation.JsonFormat;

import jmcheynier.apps.portfolio.models.enums.LangIsocode;

public class Experience {
	

    @Id
    public String id;
    @JsonFormat(pattern="yyyy-MM-dd")
	private Date startDate;
    @JsonFormat(pattern="yyyy-MM-dd")
	private Date endDate;
	private Company company;
	private HashMap<LangIsocode, String> title;
	private HashMap<LangIsocode, String> description;
	private List<Skill> skills;
	private SpokenLanguage spokenLanguage;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public Date getStartDate() {
		return startDate;
	}
	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}
	public Date getEndDate() {
		return endDate;
	}
	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}
	public Company getCompany() {
		return company;
	}
	public void setCompany(Company company) {
		this.company = company;
	}
	public HashMap<LangIsocode, String> getTitle() {
		return title;
	}
	public void setTitle(HashMap<LangIsocode, String> title) {
		this.title = title;
	}
	public HashMap<LangIsocode, String> getDescription() {
		return description;
	}
	public void setDescription(HashMap<LangIsocode, String> description) {
		this.description = description;
	}
	public List<Skill> getSkills() {
		return skills;
	}
	public void setSkills(List<Skill> skills) {
		this.skills = skills;
	}
	public SpokenLanguage getSpokenLanguage() {
		return spokenLanguage;
	}
	public void setSpokenLanguage(SpokenLanguage spokenLanguage) {
		this.spokenLanguage = spokenLanguage;
	}
	
	
	
	

}
