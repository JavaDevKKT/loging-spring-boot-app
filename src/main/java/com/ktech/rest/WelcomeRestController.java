package com.ktech.rest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeRestController {
	private Logger logger = LoggerFactory.getLogger(WelcomeRestController.class);

	@GetMapping("/welcome")
	public String welcomeMsg() {
		logger.debug("this is debug msg from welcome.....");
		logger.info("welcomeMsg() execution started.....");

		String msg = "Welcome To MY_WELCOME() :-   ";

//		try {
//			int i = 10 / 0;
//		} catch (Exception e) {
//			logger.error("Exception Occured" + e.getMessage());
//		}
//
//		logger.warn("This is warning from welcome method...");

		return msg;
	}

	@GetMapping("/greet")
	public String greetMsg() {

		logger.debug("this is debug msg from greet.....");
		String msg = "Good Morning...";
		logger.warn("This is warning from greet method...");
		logger.info("greetMsg() execution started.....");

		return msg;
	}

}
