package jmcheynier.apps.portfolio.controllers;


import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
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




	@GetMapping("/service/{serviceName}")
	public String commentsGithubGraphQL(@PathVariable("serviceName") String serviceName) throws IOException {
		String res ="";
		switch (serviceName) {
		case "getRelease" :
			res= githubService.getGithubReleases();
			break;

		default:
			res = githubService.getGithubTags();
			break;
		}
		return res;

	}



}
