package com.surpreso.spring_skeleton.services;

import static org.junit.Assert.assertTrue;

import javax.inject.Inject;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.SpringApplicationContextLoader;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.surpreso.spring_skeleton.config.DefaultConfig;
import com.surpreso.spring_skeleton.services.HelloWorldService;

@ActiveProfiles("test")
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = DefaultConfig.class, loader = SpringApplicationContextLoader.class)
public class HelloWorldServiceTests {

	@Inject
	HelloWorldService service;

	@Test
	public void test_getVersion() throws Exception {
		assertTrue(service.getVersion().endsWith("-test"));
	}

}
