package com.moinak.springplayground;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.moinak.springplayground.basic.MessagePrinter;
import com.moinak.springplayground.basic.MessagePrinterImpl;

@SpringBootApplication
public class SpringPlaygroundBasicApplication {

	public static void main(String[] args) {
		ApplicationContext app = SpringApplication.run(SpringPlaygroundBasicApplication.class, args);
		
		MessagePrinter messagePrinter1 = app.getBean(MessagePrinterImpl.class);
		MessagePrinter messagePrinter2 = app.getBean(MessagePrinterImpl.class);
		
		System.out.println(messagePrinter1);
		System.out.println(messagePrinter2);
		
		messagePrinter1.printMessage();
	}

}
