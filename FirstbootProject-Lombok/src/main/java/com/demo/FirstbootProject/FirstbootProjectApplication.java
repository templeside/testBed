package com.demo.FirstbootProject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.CrossOrigin;

@SpringBootApplication
@CrossOrigin(origins = "*", maxAge = 3600)
public class FirstbootProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(FirstbootProjectApplication.class, args);
	}

}
