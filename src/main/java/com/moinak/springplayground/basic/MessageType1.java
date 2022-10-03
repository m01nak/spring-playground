package com.moinak.springplayground.basic;

import org.springframework.stereotype.Component;

@Component
public class MessageType1 implements Message{

	String message = "This message is from first message class";

	@Override
	public String getMessage() {
		return this.message;
	}
	
}
