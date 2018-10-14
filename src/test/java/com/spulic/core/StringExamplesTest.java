package com.spulic.core;

import static org.junit.Assert.assertEquals;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Map;

import org.junit.Test;


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
	
	@Test
	public void reverseSentenceTest() {
		assertEquals(StringExamples.reverseSentence("oneword"), "oneword");
		assertEquals(StringExamples.reverseSentence("two words"), "words two");
		assertEquals(StringExamples.reverseSentence("three words inputed"), "inputed words three");
	}
	
//	@Test(expected = NullPointerException.class)
//	public void ExceptionTest() {
//		StringExamples.reverseSentence(null);
//	}
	
	@Test
	public void findDuplicates() {
		Map<String, Integer> m = null;
		m = StringExamples.findDuplicateWords("find the duplicates in the String");
		System.out.println(m);
		m = StringExamples.findDuplicateWords("there are no duplicates here");
		System.out.println(m);
		m = StringExamples.findDuplicateWords("full of duplicates duplicates duplicates full of");
		System.out.println(m);
		m = StringExamples.findDuplicateWords("dupicates here and here and there");
		System.out.println(m);
	}
	
//	@Test
//	public void findDuplicateWordsFromFile() {
//		try {
//			StringExamples se = new StringExamples();
//			se.findDuplicateWordsFromFile("DuplicateWordListFile.txt");
//		} catch (FileNotFoundException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//	}
}
