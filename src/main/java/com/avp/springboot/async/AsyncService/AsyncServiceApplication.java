package com.avp.springboot.async.AsyncService;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.scheduling.annotation.EnableAsync;

@ComponentScan("com.avp.springboot.async.AsyncService")
@SpringBootApplication
public class AsyncServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(AsyncServiceApplication.class, args);
	}
}
