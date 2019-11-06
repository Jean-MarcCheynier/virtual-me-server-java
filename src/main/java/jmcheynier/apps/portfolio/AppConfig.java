package jmcheynier.apps.portfolio;

import java.time.Duration;

import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.client.HttpComponentsClientHttpRequestFactory;
import org.springframework.web.client.RestTemplate;


@Configuration
public class AppConfig {
	@Bean
	public RestTemplate restTemplate(RestTemplateBuilder builder) {
	   // Do any additional configuration here
		
       builder.setReadTimeout(Duration.ofMillis(10000));
       builder.setConnectTimeout(Duration.ofMillis(10000));
	   return builder.build();
	}
}
