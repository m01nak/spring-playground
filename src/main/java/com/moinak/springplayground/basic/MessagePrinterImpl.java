package com.moinak.springplayground.basic;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(ConfigurableBeanFactory.SCOPE_SINGLETON)
public class MessagePrinterImpl implements MessagePrinter {

	@Autowired
	private Message messageType1;
	
	public void printMessage() {
		String messageToPrint = messageType1.getMessage();
		System.out.println(messageToPrint);
	}
	
	
	void setMessage(Message message) {
		this.messageType1 = message;
	}
}
