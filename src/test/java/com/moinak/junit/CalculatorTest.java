package com.moinak.junit;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.moinak.junit.Calculator;

class CalculatorTest {

	Calculator calculator = new Calculator();
	
	@BeforeAll
	private static void beforeAll() {
		System.out.println("Init Calculator instance");
	}
	
	@AfterAll
	private static void afterAll() {
		System.out.println("afterAll() is called");
	}
	
	@BeforeEach
	private void before() {
		calculator.setA(0);
		calculator.setB(0);
		System.out.println("Re-init Calculator instance");
	}
	
	@Test
	void multiplyTest() {	
		calculator.setA(2);
		calculator.setB(3);
		System.out.println("multiplyTest");
		assertEquals(6,calculator.multiply());
	}
	
	@Test
	void divideTest() {	
		calculator.setA(5);
		calculator.setB(2);
		System.out.println("divideTest");
		assertEquals(2.5,calculator.divide(),0.01);
	}
	
	@Test
	void addTest() {	
		calculator.setA(10);
		calculator.setB(5);
		System.out.println("addTest");
		assertEquals(15,calculator.add());
	}
	
	@Test
	void subtractTest() {	
		calculator.setA(6);
		calculator.setB(1);
		System.out.println("subtractTest");
		assertEquals(5,calculator.subtract());
	}
}
