package com.moinak.springplayground.xml;

import org.springframework.stereotype.Component;

@Component
public class JdbcConnection {
	private String id = "999";

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}
	
}
