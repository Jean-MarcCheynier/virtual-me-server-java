package jmcheynier.apps.portfolio.services;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.eclipse.jdt.internal.compiler.tool.Archive;
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

import jmcheynier.apps.portfolio.models.SAP.conversationalAI.DialogRequest;
import jmcheynier.apps.portfolio.models.SAP.conversationalAI.DialogResponse;
import jmcheynier.apps.portfolio.models.SAP.conversationalAI.Message;
import jmcheynier.apps.portfolio.models.SAP.conversationalAI.MessageText;

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

	public List<Message> sendDialogRequestV2(DialogRequest dialogRequest) {
		
		List<Message> listMessage = new ArrayList<Message>();
		
		HttpHeaders headers = new HttpHeaders();
		headers.set(HttpHeaders.AUTHORIZATION, apiSAPSecret);
		headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
		HttpEntity <DialogRequest> entity = new HttpEntity<DialogRequest>(dialogRequest, headers);

		ResponseEntity<DialogResponse> response = null;
		try {
			response = restTemplate.exchange(apiSAPDialogUrl, HttpMethod.POST, entity, DialogResponse.class);
		}catch(Exception e) {
			MessageText m = new MessageText();
			m.setContent(e.getStackTrace().toString());
			listMessage.add(m);
		}finally {
			MessageText m2 = new MessageText();
			m2.setContent("finally");
			listMessage.add(m2);
		}
		if(response.getStatusCode().equals(HttpStatus.OK)) {
			DialogResponse dialogResponse = response.getBody();
			listMessage.addAll(dialogResponse.getResults().getMessages());
		}
		return listMessage;


	}
	
	public String sendDialogRequestV3(DialogRequest dialogRequest) {
		
		String res = "";
		
		HttpHeaders headers = new HttpHeaders();
		headers.set(HttpHeaders.AUTHORIZATION, apiSAPSecret);
		headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
		HttpEntity <DialogRequest> entity = new HttpEntity<DialogRequest>(dialogRequest, headers);

		ResponseEntity<DialogResponse> response = null;
		try {
			response = restTemplate.exchange(apiSAPDialogUrl, HttpMethod.POST, entity, DialogResponse.class);
			res += "1";
		}catch(Exception e) {
			res += "2";
			res += e.getStackTrace().toString();
		}finally {
			res += "3";
		}
		if(response.getStatusCode().equals(HttpStatus.OK)) {
			res += "4";				
		}
		return res;


	}

}
