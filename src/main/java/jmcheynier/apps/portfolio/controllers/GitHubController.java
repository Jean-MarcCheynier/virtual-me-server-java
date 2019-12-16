package jmcheynier.apps.portfolio.controllers;


import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import jmcheynier.apps.portfolio.services.GithubService;

@RestController
@RequestMapping("/api/v2/github")
public class GitHubController {
	
	@Autowired
	GithubService githubService;




	@GetMapping(value="/service/{serviceName}", produces=MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Object> commentsGithubGraphQL(@PathVariable("serviceName") String serviceName) throws IOException {
		ResponseEntity<Object> res;
		switch (serviceName) {
		case "getRelease" :
			res= ResponseEntity.ok(githubService.getGithubReleases());
			break;

		default:
			res = ResponseEntity.notFound().build();
			break;
		}
		
		return res;
		

	}



}
