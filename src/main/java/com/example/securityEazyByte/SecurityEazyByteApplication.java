package com.example.securityEazyByte;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScans;

@SpringBootApplication
@ComponentScans({
		@ComponentScan("com.example.securityEazyByte.controller"),
		@ComponentScan("com.example.securityEazyByte.config")
})
public class SecurityEazyByteApplication {

	public static void main(String[] args) {
		SpringApplication.run(SecurityEazyByteApplication.class, args);
	}

}
