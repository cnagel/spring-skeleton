package com.surpreso.spring_skeleton;

import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.context.annotation.Import;

/**
 * A simple "Hello world" application using Spring Boot.
 * 
 * @author Christoph Nagel
 */
@Import(DefaultConfig.class)
public class HelloWorldApplication implements CommandLineRunner {

	@Autowired
	private HelloWorldService helloWorldService;

	public static void main(String... args) {
		SpringApplication.run(HelloWorldApplication.class, args);
	}

	public void run(String... args) throws Exception {
		LoggerFactory.getLogger(getClass()).info(
				"This application works on version "
						+ helloWorldService.getVersion());
	}

}
