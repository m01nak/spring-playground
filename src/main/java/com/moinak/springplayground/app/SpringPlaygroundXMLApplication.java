package com.moinak.springplayground.app;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.moinak.springplayground.xml.BusinessLogic;

public class SpringPlaygroundXMLApplication {
	public static void main(String[] args) {
		
		try(ClassPathXmlApplicationContext app = new ClassPathXmlApplicationContext("applicationContext.xml")) {
			BusinessLogic businessLogic = app.getBean(BusinessLogic.class);
			
			businessLogic.checkBeans();
		}
	}
	
}
