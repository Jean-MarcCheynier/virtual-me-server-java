package jmcheynier.apps.portfolio.services;

import java.io.IOException;

import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.io.ResourceLoader;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import com.fasterxml.jackson.databind.ObjectMapper;

import jmcheynier.apps.portfolio.models.SAP.conversationalAI.DialogRequest;
import jmcheynier.apps.portfolio.models.SAP.conversationalAI.DialogResponse;
import jmcheynier.apps.portfolio.models.SAP.conversationalAI.Message;
import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;

@Service
public class SAPService {
	
	@Autowired 
	ResourceLoader resourceLoader;
	
	@Value("${api.sap.dialog.url}")
	private String apiSAPDialogUrl;
	
	@Value("${api.sap.secret}")
	private String apiSAPSecret;
	

	private static final MediaType JSONTYPE  = MediaType.get("application/json; charset=utf-8");
	
	
	public String sendDialogRequest(DialogRequest d) throws IOException {
		
		ObjectMapper mapper = new ObjectMapper();
		String json = mapper.writeValueAsString(d);

	    System.out.println(json);

		OkHttpClient client = new OkHttpClient();
		
		RequestBody body = RequestBody.create(JSONTYPE, json);
		Request request = new Request.Builder()
				.header("Authorization", apiSAPSecret)
				.url(apiSAPDialogUrl)
				.post(body)
				.build();
		try (Response response = client.newCall(request).execute()) {
            if (response.isSuccessful()) {
                return response.body().string();
            }
			return "error";
		}
		
	}	

}
