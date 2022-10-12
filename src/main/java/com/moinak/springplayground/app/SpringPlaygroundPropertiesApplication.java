package com.moinak.springplayground.app;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import com.moinak.springplayground.property.PropertyReader;

@Configuration
@ComponentScan("com.moinak.springplayground.property")
@PropertySource("classpath:propertyApp.properties")
public class SpringPlaygroundPropertiesApplication {

	private static Logger LOGGER = LoggerFactory.getLogger(SpringPlaygroundPropertiesApplication.class);
	
	public static void main(String[] args) {
		try(AnnotationConfigApplicationContext app = new AnnotationConfigApplicationContext(SpringPlaygroundPropertiesApplication.class)) {
	
			PropertyReader propertyReader = app.getBean(PropertyReader.class);
			
			LOGGER.info(propertyReader.getPropertyValue());
		}
	}
	
}
