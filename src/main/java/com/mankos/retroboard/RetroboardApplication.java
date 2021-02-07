package com.mankos.retroboard;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@SpringBootApplication
public class RetroboardApplication {

	public static void main(String[] args) {
      //Creating the Logger object
      Logger logger = LoggerFactory.getLogger("SampleLogger");

      //Logging the information
      logger.info("Hi This is my first SLF4J program");
		SpringApplication.run(RetroboardApplication.class, args);
	}

}
