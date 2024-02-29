package com.example.restservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class DemoApplication {

	public static void main(String[] args) {
		try {
			SpringApplication.run(DemoApplication.class, args);
		} catch (Exception ex) {
			System.out.println(ex.getMessage());
			ex.printStackTrace();
		}
	}

	@GetMapping("/hi")
	public String hello(@RequestParam(value = "name", defaultValue = "World") String name) {
		return String.format("Hello Spring %s!", name);
	}
}
