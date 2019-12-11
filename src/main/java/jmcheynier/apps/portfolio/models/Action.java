package jmcheynier.apps.portfolio.models;

import jmcheynier.apps.portfolio.models.enums.ActionCode;

public class Action {
	
	private ActionCode actionCode;
	private String content;
	public ActionCode getActionCode() {
		return actionCode;
	}
	public void setActionCode(ActionCode actionCode) {
		this.actionCode = actionCode;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	
	

}
