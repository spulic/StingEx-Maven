package com.spulic.core;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class NumberExamplesTest {
	
	@Test
	public  void sumTest() {
		int[] i = {1,5,7,4,10};
		int[] i1 = {1,10};
// this is added in the test branch
	}
	
	@Test
	public  void callMethods() {
		int[] val = {5,8,6,34,76,34,2,9,46,78,33};
		NumberExamples.order(val);
		NumberExamples.multidimension();
		NumberExamples.methods();
		NumberExamples.printArray(new int[] {3,5,9,10,3});
	}
}
