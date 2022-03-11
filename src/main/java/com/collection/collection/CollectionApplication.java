package com.collection.collection;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class CollectionApplication {

	public static void main(String[] args) {
		SpringApplication.run(CollectionApplication.class, args);
	}

	@RequestMapping("/")
	String home(){
		return "Hello Word!";
	}
	@RequestMapping("/v1/user/Lucas")
	String teste_Lucas(){
		return "Hello Lucas!";
	}

}
