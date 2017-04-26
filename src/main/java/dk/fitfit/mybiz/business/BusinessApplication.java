package dk.fitfit.mybiz.business;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "dk.fitfit.mybiz")
public class BusinessApplication {
	public static void main(String[] args) {
		SpringApplication.run(BusinessApplication.class, args);
	}
}
