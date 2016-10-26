package com.YoungMoney;

import org.h2.tools.Server;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.sql.SQLException;

@SpringBootApplication
public class RegistrationFormSpringApplication {

	public static void main(String[] args) throws SQLException {
		SpringApplication.run(RegistrationFormSpringApplication.class, args);
	}
}
