package jmcheynier.apps.portfolio.controllers.v2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import jmcheynier.apps.portfolio.models.Action;
import jmcheynier.apps.portfolio.models.enums.ActionCode;
import jmcheynier.apps.portfolio.models.mongoModel.Skill;
import jmcheynier.apps.portfolio.services.SocketService;

@RestController("ActionControllerV2")
@RequestMapping("/api/v2/action")
public class ActionController {

	
	@Autowired SocketService socketService;
	
	@PostMapping
	public void action(@RequestBody Action action) {
		socketService.sendPrivateMessage(action.getConvId(), action);
	}
	
	@GetMapping("/userColor/{color}")
	public void userColor(@PathVariable("color") String color) {
		Action action = new Action();
		action.setActionCode(ActionCode.changeUserColor);
		action.setContent(color);
		socketService.sendPrivateMessage("1368", action);
	}
	
	@GetMapping("/slide")
	public ResponseEntity<String> toggleSlide() {
		Action action = new Action();
		action.setActionCode(ActionCode.openPage);
		System.out.println("RECIEVED");
		socketService.sendPrivateMessage("1368", action);
		return new ResponseEntity<String>("plop", HttpStatus.OK);
	}
	
	

}
