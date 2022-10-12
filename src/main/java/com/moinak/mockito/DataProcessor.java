package com.moinak.mockito;

public class DataProcessor {

	private DataSupply dataSupply;

	DataProcessor(DataSupply dataSupply) {
		this.dataSupply = dataSupply;
	}
	
	public double max() {
		int[] data = dataSupply.getData();
		double max = Double.MIN_VALUE;
		for (int number : data) {
			if ((double) number > max) {
				max = (double) number;
			}
		}
		return max;
	}

}
