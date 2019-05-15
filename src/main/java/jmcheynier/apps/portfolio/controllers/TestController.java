package jmcheynier.apps.portfolio.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;



@Controller
public class TestController {

	
	@RequestMapping("/")
	public String index() {
		System.out.println("hmmm");
		return "index";
	}



}
