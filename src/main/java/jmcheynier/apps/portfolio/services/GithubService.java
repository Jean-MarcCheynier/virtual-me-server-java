package jmcheynier.apps.portfolio.services;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;

import org.apache.commons.io.FileUtils;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.ResourceLoader;
import org.springframework.stereotype.Service;

import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;

@Service
public class GithubService {
	
	
	@Autowired 
	ResourceLoader resourceLoader;
	
	@Value("${api.github.url}")
	private String apiGithubUrl;
	
	@Value("${api.github.secret}")
	private String apiGithubSecret;
	

	private static final String QUERY = "queries/query.txt";
	private static final String QUERY_RELEASES = "queries/queryReleases.txt";
	private static final MediaType JSONTYPE  = MediaType.get("application/json; charset=utf-8");
	private static final String queryReleases = "query { repository(name: \"portfolio\", owner: \"Jean-MarcCheynier\") { releases(last: 10, orderBy : { field : CREATED_AT, direction: DESC }) { edges { node {  createdAt publishedAt author { login avatarUrl } tagName name  description descriptionHTML isDraft url name }  } } }}";
	
	
	public String getGithubTags() throws IOException {
		JSONObject json = new JSONObject();
		 

	    json.put("query",  queryReleases.trim()/*.replaceAll("(\\r|\\n)", "")*/);
		
	    System.out.println(json.toString());

		OkHttpClient client = new OkHttpClient();
		
		RequestBody body = RequestBody.create(JSONTYPE, json.toString());
		Request request = new Request.Builder()
				.header("Authorization", apiGithubSecret)
				.url(apiGithubUrl)
				.post(body)
				.build();
		try (Response response = client.newCall(request).execute()) {
			return response.body().string();
		}
		
	}	
	
	public String getGithubReleases() throws IOException {
		JSONObject json = new JSONObject();
		 
 
	    json.put("query",  queryReleases.trim());	

		OkHttpClient client = new OkHttpClient();
		
		RequestBody body = RequestBody.create(JSONTYPE, json.toString());
		Request request = new Request.Builder()
				.header("Authorization", apiGithubSecret)
				.url(apiGithubUrl)
				.post(body)
				.build();
		try (Response response = client.newCall(request).execute()) {
			return response.body().string();
		}
		
	}	

}
