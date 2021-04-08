package com.jakebakewell.helloworld;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication

@RestController
public class HelloworldApplication {

	public static void main(String[] args) {
		SpringApplication.run(HelloworldApplication.class, args);
	}
	@RequestMapping("/")
	public String hello() {
		return "Hiya client! Are you doing well today?";
	}
	
	@RequestMapping("/random")
	public String random() {
		return "Wow! Spring is cool! It is super easy to respond with strings in it.";
	}

}
