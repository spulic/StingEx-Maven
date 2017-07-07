package StringExamples;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;


public class StringExamplesTest {

	@Test
	public void swapLastTwoChar() {
		assertEquals(StringExamples.swapLastTwoChar("A"), "A");
		assertEquals(StringExamples.swapLastTwoChar("AB"), "BA");
		assertEquals(StringExamples.swapLastTwoChar("RAIN"), "RANI");
	}
	
	@Test
	public void firstTwo() {
		assertEquals(StringExamples.firstTwo("name"),"na");
		assertEquals(StringExamples.firstTwo("n"),"n");
	}
}
