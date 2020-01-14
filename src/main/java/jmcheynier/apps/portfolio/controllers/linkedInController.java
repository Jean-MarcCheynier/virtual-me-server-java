package jmcheynier.apps.portfolio.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v2/linkedIn")
public class linkedInController {
	
	private static final String clientId = "868m5vb97enr52";
	private static final String clientSecret = "XLxaBpXvR7Vhpb54";
	
	private static final String code = "AQR0a2OMbIE3bnfcMKMzoRU3DVHg1d6jeiTFE_wf-cuVu67kQocS9scJDJEGdyKMU_yT7xZ9gDrIfCAAbiOeQAJmAmnYtmo7p2CapePXqDK9cmM-r2fJyRbEKDuAaw7Pl_rnk_tDI2Sxtczar6gFSNSRXuE5Y-ziiJo3-f_qBm-Vuvo8plh2YEhEVIaXug";
	private static final String state = "fooobar";
	
	
	private static final String access_token = "AQW1Dpvwfj3suvE1NXGf7c874d1c5hVUul3nQ1CMql6H7cRxvj4UtGYYsIRXi_u2S3PAV3XgLjJBe1TJyGz6zRjlIm7DTyH--pvZckbyQfjGPyi3m7MoOtgQ7R4PtuYOpxj0XQr8JplKQV2SJmcOuslSUU8lRJSlVb0-UJFA5ZTtnpXgCFGBbKOHI1HbRrjezlenDH6jyGNlxSmRfKCzWuWE5DpwYzpznvHsGb5DuZuk3gQZxwW_oaumbGI6PIikYkgXBmkEKlLQ3kIxiqDtCnL5J2Eqkm99x_2V7JbYqbm4EFyXzzPLGkNO0XC54yYVTloSPIOSSz2kCp26EmZZp6qFI0Z5Sw";
	private static final long expires_in = 5183999;
	
	/* Sadly today 14/01/2020 LinkedIn does not grant permission to access the full profile through their API */ 
	@GetMapping
	public void get() {
		
	}
	
	@GetMapping("/callback")
	public void callback() {
		
	}

}
