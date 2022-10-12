package com.moinak.mockito;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
class DataProcessorMockTest {

	@Mock
	private DataSupply dataSupplyMock;
	
	@InjectMocks
	private DataProcessor dataProcessor;
	
	@Test
	void maxTest_emptyArray() {
		
		int[] emptyArray = new int[] {};
		
		when(dataSupplyMock.getData()).thenReturn(emptyArray);
		assertEquals(Double.MIN_VALUE, dataProcessor.max(),0.0000000001);
	}
	
	@Test
	void maxTest_singletonArray() {
		
		int[] singletonArray = new int[] {10};
		
		when(dataSupplyMock.getData()).thenReturn(singletonArray);
		assertEquals(10.0, dataProcessor.max(),0.0000000001);
	}
	
	@Test
	void maxTest_multiElementArray() {
		
		int[] multiElementArray = new int[] {3,5,10,9,16,11,1,2,3,33};
		
		when(dataSupplyMock.getData()).thenReturn(multiElementArray);
		assertEquals(33, dataProcessor.max(),0.0000000001);
	}

}
