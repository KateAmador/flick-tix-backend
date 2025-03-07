package com.flicktix.flick_tix;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;

@SpringBootApplication
@OpenAPIDefinition(info = @Info(title = "Flick Tix API", version = "1.0", description = "API for movie ticketing system"))
public class FlickTixApplication {

	public static void main(String[] args) {
		SpringApplication.run(FlickTixApplication.class, args);
	}

}
