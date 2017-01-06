package org.springframework.boot.sample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class EmbeddedDbApplication {

	public static void main(String[] args) {
		SpringApplication.run(EmbeddedDbApplication.class, args);
	}

}
