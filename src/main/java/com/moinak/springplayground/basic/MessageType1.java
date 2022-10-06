package com.moinak.springplayground.basic;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
public class MessageType1 implements Message{

	Logger logger = LoggerFactory.getLogger(MessageType1.class);
	String message = "This message is from first message class";

	@Override
	public String getMessage() {
		logger.info("Returning message from class MessageType1");
		return this.message;
	}
	
	
	
	
}
