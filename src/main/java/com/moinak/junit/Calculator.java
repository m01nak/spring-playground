package com.moinak.junit;

public class Calculator {
	
	int a;
	int b;
	
	
	public int multiply() {
		return a * b;
	}
	
	public double divide() {
		return (double) a/b;
	}
	
	public int add () {
		return a + b;
	}
	
	public int subtract() {
		return a - b;
	}

	public int getA() {
		return a;
	}

	public void setA(int a) {
		this.a = a;
	}

	public int getB() {
		return b;
	}

	public void setB(int b) {
		this.b = b;
	}
}
