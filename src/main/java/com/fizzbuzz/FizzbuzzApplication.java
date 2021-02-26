package com.fizzbuzz;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author VMR
 */
@SpringBootApplication
@EnableAutoConfiguration
public class FizzbuzzApplication {

	public static void main(final String[] args) {
		SpringApplication.run(FizzbuzzApplication.class, args);
	}

}
