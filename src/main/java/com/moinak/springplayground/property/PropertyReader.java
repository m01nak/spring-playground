package com.moinak.springplayground.property;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Repository;

@Repository
public class PropertyReader {
	
	@Value("${example.key}")
	private String propertyValue;
	
	public String getPropertyValue() {
		return propertyValue;
	}
}
