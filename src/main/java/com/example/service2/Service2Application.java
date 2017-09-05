package com.example.service2;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

@RestController
@SpringBootApplication
public class Service2Application {

	private Logger logger = LoggerFactory.getLogger(this.getClass());

	@GetMapping("welcome")
	String welcome(HttpServletRequest request) {

		logger.info("chamada do service2 welcome");

		return "Seja bem vindo!!!!";
	}

	public static void main(String[] args) {
		SpringApplication.run(Service2Application.class, args);
	}
}
