package com.log4j.pro.log4j;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class log4j {

	private static Logger logger=LogManager.getLogger(log4j.class);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       System.out.println("how are you");
		logger.trace("this is trace message");
		logger.info("this is information message");
		logger.error("this is error message");
		logger.warn("this is warning message");
		logger.fatal("this is fatal message");
		System.out.print("completed");
		
		
	}

}
