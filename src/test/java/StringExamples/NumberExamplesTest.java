package StringExamples;



import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

import NumberExamples.NumberExamples;


public class NumberExamplesTest {
	
	@Test
	public static void sumTest() {
		int[] i = {1,5,7,4,10};
		int[] i1 = {1,10};
		assertEquals(NumberExamples.sum(i, 11),i1);
		int[] i2 = {1,7};
		assertEquals(NumberExamples.sum(i, 8),i2);
		int[] i3 = {4,10};
		assertEquals(NumberExamples.sum(i, 14),i3);
		int[] i4 = {7,10};
		assertEquals(NumberExamples.sum(i, 17),i4);
	}
}
