package com.John.TaskManagement;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
// program running 하는 곳
@SpringBootApplication
@EntityScan("com.John")
@ComponentScan("com.John")
@EnableJpaRepositories("com.John")
public class TaskManagementApplication {
	public static void main(String[] args) {
		SpringApplication.run(TaskManagementApplication.class, args);
	}
}