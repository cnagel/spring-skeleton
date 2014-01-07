package com.surpreso.spring_skeleton;

import javax.inject.Inject;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.context.annotation.Import;

import com.surpreso.spring_skeleton.config.DefaultConfig;
import com.surpreso.spring_skeleton.services.HelloWorldService;

/**
 * A simple "Hello world" application using Spring Boot.
 * 
 * @author Christoph Nagel
 */
@Import(DefaultConfig.class)
public class HelloWorldApplication implements CommandLineRunner {

	@Inject
	private HelloWorldService helloWorldService;

	public static void main(String... args) {
		SpringApplication.run(HelloWorldApplication.class, args);
	}

	public void run(String... args) throws Exception {
		System.out.println(helloWorldService.getVersion());

	}

}
