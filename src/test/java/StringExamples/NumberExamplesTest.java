package StringExamples;

import org.testng.Assert;
import org.testng.annotations.Test;

import NumberExamples.NumberExamples;


public class NumberExamplesTest {
	
	@Test
	public static void sumTest() {
		int[] i = {1,5,7,4,10};

NumberExamples.sum(i, 11);

NumberExamples.sum(i, 8);

NumberExamples.sum(i, 14);

NumberExamples.sum(i, 17);
	}
}
