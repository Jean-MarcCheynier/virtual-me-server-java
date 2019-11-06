package jmcheynier.apps.portfolio.models.SAP.conversationalAI;

import java.util.List;

public class MultipleChoice {
	
	public String title;
	public List<Button> buttons;
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public List<Button> getButtons() {
		return buttons;
	}
	public void setButtons(List<Button> buttons) {
		this.buttons = buttons;
	}
	
	

}
