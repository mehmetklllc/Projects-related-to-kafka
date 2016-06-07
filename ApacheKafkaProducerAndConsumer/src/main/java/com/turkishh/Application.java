package com.turkishh;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.integration.config.EnableIntegration;

@SpringBootApplication
@EnableIntegration
public class Application {
    private static final Logger LOGGER = LoggerFactory.getLogger(Application.class);
		public static void main(String[] args) {
			LOGGER.info("Starting...");
			SpringApplication.run(Application.class, args);
		}
	}