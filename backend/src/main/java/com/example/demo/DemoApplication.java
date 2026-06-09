package com.example.demo;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@Bean
	CommandLineRunner init(MessageRepository repository) {
		return args -> {
			if(repository.count() == 0) {
				Message message = new Message();
				message.setText("Hola desde PostgreSQL");

				repository.save(message);
			}
		};
	}
}
