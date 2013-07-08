package com.surpreso.spring_skeleton.jobs;

import org.apache.commons.lang3.ArrayUtils;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.surpreso.spring_skeleton.confg.MainConfig;

/**
 * An abstract Job class, which helps to initialize the Spring context.
 * 
 * @author Christoph Nagel
 */
abstract public class AbstractSpringJob {

	static private ApplicationContext ctx;

	/**
	 * Initiates the Spring context object by the given configurations. For
	 * default, {@link MainConfig} is used for bootstrapping properties.
	 * 
	 * @param configurations
	 *            An array of configuration classes
	 */
	static protected void init(Class<?>... configurations) {
		// create the Spring context
		ctx = new AnnotationConfigApplicationContext(
				(Class<?>[]) ArrayUtils.add(configurations, MainConfig.class));
	}

	/**
	 * Getter for the Spring context
	 * 
	 * @return The Spring context
	 */
	static protected ApplicationContext getContext() {
		return ctx;
	}

}
