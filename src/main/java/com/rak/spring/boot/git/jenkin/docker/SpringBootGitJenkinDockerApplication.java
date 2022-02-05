package com.rak.spring.boot.git.jenkin.docker;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringBootGitJenkinDockerApplication {

	@GetMapping("/message")
	public String getMessage() {

		return "Welcome to Docker by Git Jenkin..!!";
	}

	public static void main(String[] args) {
		SpringApplication.run(SpringBootGitJenkinDockerApplication.class, args);
	}

}
