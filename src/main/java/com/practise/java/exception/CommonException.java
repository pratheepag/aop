package com.practise.java.exception;

import java.io.IOException;
import java.sql.SQLException;

import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class CommonException {

	private final org.slf4j.Logger log = org.slf4j.LoggerFactory.getLogger(CommonException.class);
	
    @AfterThrowing(pointcut = "execution(* com.practise.java.*.*(..))", throwing = "exception")
	public void logException(Exception ex) {
		handleException(ex);
	}

	private void handleException(Exception ex) {
        if (ex instanceof IOException ioEx) {
            log.error("IOException occurred: {}", ioEx.getMessage());
        } else if (ex instanceof SQLException sqlEx) {
            log.error("SQLException occurred: {}", sqlEx.getMessage());
        } else {
            log.error("Exception occurred: {}", ex.getMessage());
        }
	}
}
