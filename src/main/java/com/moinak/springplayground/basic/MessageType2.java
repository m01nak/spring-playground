package com.moinak.springplayground.basic;

import org.springframework.stereotype.Component;

@Component
public class MessageType2 implements Message{

	String message = "This message is from second message class";

	@Override
	public String getMessage() {
		return this.message;
	}
	
}
