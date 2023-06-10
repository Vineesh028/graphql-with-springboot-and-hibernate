package com.graphql.test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@EnableTransactionManagement
public class SpringbootGraphQlApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootGraphQlApplication.class, args);
	}

}
