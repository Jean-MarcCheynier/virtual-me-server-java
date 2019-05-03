package jmcheynier.apps.portfolio.services;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.io.ResourceLoader;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.fasterxml.jackson.databind.ObjectMapper;

import jmcheynier.apps.portfolio.models.SAP.conversationalAI.DialogRequest;
import jmcheynier.apps.portfolio.models.SAP.conversationalAI.DialogResponse;
import jmcheynier.apps.portfolio.models.SAP.conversationalAI.IMessage;
import jmcheynier.apps.portfolio.models.SAP.conversationalAI.Message;
import jmcheynier.apps.portfolio.models.SAP.conversationalAI.MessageText;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;

@Service
public class SAPService {

	@Autowired 
	ResourceLoader resourceLoader;

	@Autowired
	RestTemplate restTemplate;

	@Value("${api.sap.dialog.url}")
	private String apiSAPDialogUrl;

	@Value("${api.sap.secret}")
	private String apiSAPSecret;

	private static final okhttp3.MediaType JSONTYPE  = okhttp3.MediaType.get("application/json; charset=utf-8");


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

	public List<Message> sendDialogRequestV2(DialogRequest dialogRequest) throws IOException {
		HttpHeaders headers = new HttpHeaders();
		headers.set(HttpHeaders.AUTHORIZATION, apiSAPSecret);
		headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
		HttpEntity <DialogRequest> entity = new HttpEntity<DialogRequest>(dialogRequest, headers);

		ResponseEntity<String> response1 = restTemplate.exchange(apiSAPDialogUrl, HttpMethod.POST, entity, String.class);
		if(response1.getStatusCode().equals(HttpStatus.OK)) {
			String res1 = response1.getBody();
		}
		ResponseEntity<DialogResponse> response2 = restTemplate.exchange(apiSAPDialogUrl, HttpMethod.POST, entity, DialogResponse.class);
		DialogResponse d = new DialogResponse();
		if(response2.getStatusCode().equals(HttpStatus.OK)) {
			DialogResponse dialogResponse = response2.getBody();
			return dialogResponse.getResults().getMessages();
		}
		return null;


	}

}
