package com.hemansu.studentregistration.resources;

import java.io.IOException;
import java.util.Date;

import org.apache.log4j.ConsoleAppender;
import org.apache.log4j.FileAppender;
import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import org.apache.log4j.SimpleLayout;


public class RegistrationLogger {
	
	private static final Logger LOGGER = Logger.getLogger("errorLogger");
	private static SimpleLayout layout = new SimpleLayout();
	private static FileAppender appender;
	
	static {
		try {
			appender = new FileAppender(layout, RegistrationConfig.getPath("errorLoggerPath"), true);
		} catch (IOException exception) {
			
		}
	}

	public static void logError(String className, String methodName,String exception) {
		
		LOGGER.addAppender(appender);
		LOGGER.setLevel((Level) Level.ERROR);
		LOGGER.error(new Date().toString());
		LOGGER.error("ClassName :" + className);
		LOGGER.error("MethodName :" + methodName);
		LOGGER.error("Exception :" + exception);
		LOGGER.error("-----------------------------------------------------------------------------------");
	}
	
	public static void logInfo(String className, String methodName,String message) {
		
		LOGGER.addAppender(new ConsoleAppender());
		LOGGER.setLevel((Level) Level.INFO);
		LOGGER.info(new Date().toString());
		LOGGER.info("ClassName :" + className);
		LOGGER.info("MethodName :" + methodName);
		LOGGER.info("Message :" + message);
		LOGGER.info("-----------------------------------------------------------------------------------");
	}
}
