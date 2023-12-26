package com.eamcode.connectoa;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class ConnectOaApplication {

	public static void main(String[] args) {
		SpringApplication.run(ConnectOaApplication.class, args);
	}
@RestController
	class HelloControleur{
		@GetMapping("/")
	String hello(){
			return " HELLO !!!";
	}
}
}
