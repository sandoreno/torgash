package com.example.torgash;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class TorgashApplication {

	public static void main(String[] args) {
		SpringApplication.run(TorgashApplication.class, args);
	}
}
