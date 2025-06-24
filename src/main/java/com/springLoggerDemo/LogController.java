package com.springLoggerDemo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LogController {
private static final Logger logger = LoggerFactory.getLogger(LogController.class);
 
@RequestMapping("/logapi/{sp}")
public String logMethod(@PathVariable String sp) {
	logger.info("Hello from Spring Boot Logging Application.");
    logger.info("This is sample info message");
    logger.warn("This is sample warn message");
    logger.error("This is sample error message");
    logger.info(sp);
    
    return sp;
}
}