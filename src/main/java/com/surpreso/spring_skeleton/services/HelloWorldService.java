package com.surpreso.spring_skeleton.services;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class HelloWorldService {

	@Value("${version:0.1}")
	private String version;

	/**
	 * @return the version
	 */
	public String getVersion() {
		return version;
	}

}
