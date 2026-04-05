package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

// starts srping
// creates container
// scans for components
// runs embedded server
// basically does everything for you (app engine)
// compoenet sxanning - looks for @Component, @Service, @Repository, @Controller, @RestController
@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

}
