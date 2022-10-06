package com.moinak.springplayground.app;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringPlaygroundXMLApplication {
	private static Logger LOGGER = LoggerFactory.getLogger(SpringPlaygroundXMLApplication.class);
	public static void main(String[] args) {
		
		try(ClassPathXmlApplicationContext app = new ClassPathXmlApplicationContext("applicationContext.xml")) {
			
		}
	}
	
}
