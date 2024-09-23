package com.tesla.crud;

import com.tesla.crud.person.Person;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@SpringBootApplication
public class CrudTeslaApplication {

	public static void main(String[] args) {
		SpringApplication.run(CrudTeslaApplication.class, args);
	}
}
