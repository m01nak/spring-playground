package com.moinak.springplayground.app;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.moinak.springplayground.basic.MessagePrinter;
import com.moinak.springplayground.basic.MessagePrinterImpl;

@Configuration
@ComponentScan("com.moinak.springplayground.basic")
public class SpringPlaygroundBasicApplication {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext app = new AnnotationConfigApplicationContext(SpringPlaygroundBasicApplication.class);
		
		MessagePrinter messagePrinter1 = app.getBean(MessagePrinterImpl.class);
		MessagePrinter messagePrinter2 = app.getBean(MessagePrinterImpl.class);
		
		System.out.println(messagePrinter1);
		System.out.println(messagePrinter2);
		
		messagePrinter1.printMessage();
	}

}
