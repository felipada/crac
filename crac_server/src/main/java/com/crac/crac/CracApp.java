package crac;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;

@SpringBootApplication
@Configuration
public class CracApp {

	public static void main(String[] args) {
		SpringApplication.run(CracApp.class, args);
	}
}
