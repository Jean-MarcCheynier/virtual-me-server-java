package jmcheynier.apps.portfolio;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PortfolioApplication {

	public static void main(String[] args) {
		System.setProperty("java.net.useSystemProxies", "true");
		SpringApplication.run(PortfolioApplication.class, args);
	}

}
