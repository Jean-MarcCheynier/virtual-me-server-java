package jmcheynier.apps.portfolio.controllers.v2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import jmcheynier.apps.portfolio.models.Action;
import jmcheynier.apps.portfolio.models.enums.ActionCode;
import jmcheynier.apps.portfolio.services.SocketService;

@RequestMapping("/api/v2/action")
public class ActionController {
	
	@Autowired SocketService socketService;
	
	@GetMapping("/slide")
	public void toggleSlide() {
		Action action = new Action();
		action.setActionCode(ActionCode.openPage);
		
		socketService.sendPrivateMessage("1368", action);
	}
	
	

}
