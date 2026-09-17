package com.question;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//step :3 isme ham load-balancing ase kar rah ki ham question-service ko stop kar ra h aur quiz ke localhost se question ka data bhi call kar rah ha

@SpringBootApplication
public class QuestionServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(QuestionServiceApplication.class, args);
	}

}
