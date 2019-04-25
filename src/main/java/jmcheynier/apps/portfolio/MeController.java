package jmcheynier.apps.portfolio;


import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import jmcheynier.apps.portfolio.services.GithubService;
import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;

@RestController
@RequestMapping("/me")
public class MeController {
	
	@Autowired
	GithubService githubService;

	public static final MediaType JSON  = MediaType.get("application/json; charset=utf-8");

	@RequestMapping("/")
	public Me index() {
		Me me = new Me();
		me.setName("undefined");
		return me;
	}

	@RequestMapping("/name/{name}")
	public Me index(@PathVariable String name) {
		Me me = new Me();
		me.setName(name);
		return me;
	}

	@RequestMapping("/comments")
	public String commentsGithubGraphQL() throws IOException {
		return githubService.getGithubTags();

	}



}
