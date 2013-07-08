package com.surpreso.spring_skeleton.jobs;

/**
 * A simple Hello World example how to initialize the Spring context-
 * 
 * @author Christoph Nagel
 */
public class HelloWorldJob extends AbstractSpringJob {

	public static void main(String... arg) {
		// init the Spring context
		init();
		// do some job instructions
		System.out.println("Version: "
				+ getContext().getEnvironment().getProperty("version"));
	}

}
