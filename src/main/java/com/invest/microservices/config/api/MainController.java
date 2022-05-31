package com.invest.microservices.config.api;

import java.util.Date;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {

	private static final Logger LOGGER = LoggerFactory.getLogger(MainController.class);
	
	@GetMapping("/live-check")
	public String sendMessage() throws Exception {
		LOGGER.info("test info log");
		LOGGER.warn("test warn log");
		LOGGER.error("test error");
		return "1Invest Config Server:: " + new Date();
	}
}
