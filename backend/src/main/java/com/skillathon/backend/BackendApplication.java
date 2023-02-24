package com.skillathon.backend;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication /*(exclude={DataSourceAutoConfiguration.class})*/
@RestController
public class BackendApplication {

	public static void main(String[] args) {
		SpringApplication.run(BackendApplication.class, args);
	}
	
	/*@GetMapping(value="/")
	public String demo(@RequestParam("name")String name) {
		
		return "hello " + name + ", your application is working";
	}*/ // Parameter passed
	
	/*@GetMapping(value="/")
	public String demo() {
		return "your application is working";
	} */
}











