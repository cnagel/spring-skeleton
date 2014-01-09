package com.surpreso.spring_skeleton.services;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * A simple service to load the current version of the application.
 * 
 * @author Christoph Nagel
 */
@Component
public class HelloWorldService {

	@Value("${app.version}")
	private String version;

	/**
	 * @return the version
	 */
	public String getVersion() {
		return version;
	}

}
