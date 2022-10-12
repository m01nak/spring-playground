package com.moinak.mockito;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;

class DataProcessorMockTest {

	@Test
	void maxTest_emptyArray() {
		
		int[] emptyArray = new int[] {};
		
		DataSupply dataSupplyMock = mock(DataSupply.class);
		when(dataSupplyMock.getData()).thenReturn(emptyArray);
		DataProcessor dataProcessor = new DataProcessor(dataSupplyMock);
		assertEquals(Double.MIN_VALUE, dataProcessor.max(),0.0000000001);
	}
	
	@Test
	void maxTest_singletonArray() {
		
		int[] singletonArray = new int[] {10};
		
		DataSupply dataSupplyMock = mock(DataSupply.class);
		when(dataSupplyMock.getData()).thenReturn(singletonArray);
		DataProcessor dataProcessor = new DataProcessor(dataSupplyMock);
		assertEquals(10.0, dataProcessor.max(),0.0000000001);
	}
	
	@Test
	void maxTest_multiElementArray() {
		
		int[] multiElementArray = new int[] {3,5,10,9,16,11,1,2,3,33};
		
		DataSupply dataSupplyMock = mock(DataSupply.class);
		when(dataSupplyMock.getData()).thenReturn(multiElementArray);
		DataProcessor dataProcessor = new DataProcessor(dataSupplyMock);
		assertEquals(33, dataProcessor.max(),0.0000000001);
	}

}
