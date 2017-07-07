package StringExamples;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

public class StringExamples {
	
	public static String sentence = "No signal for current input";

	public static void main(String[] args) {
		String s = firstTwo("four");
		System.out.println(s);
		s = swapLastTwoChar("four");
		System.out.println(s);
		s = reverseSentence(sentence);
		System.out.println(s);
	}
	
	
	public static String firstTwo(String str) {
		if (str == null) throw new NullPointerException();
		if (str.length() < 2) return str;
		return str.length()>0?str.substring(0,2):str;
	}


	//swap last two characters
	@SuppressWarnings("unused")
	public static String swapLastTwoChar(String s) {
		//Null check & minimum expected length to create objects to proceed
		if (s == null) throw new NullPointerException();
		if (s.length() <= 1) return s;
		char[] ch = s.toCharArray();
		//String and Arrays starts with index value of '0'
		ch[ch.length-2] = s.charAt(s.length()-1);	
		ch[ch.length-1] = s.charAt(s.length()-2);
		return String.valueOf(ch);
	}
	
	/**
	 * Reverse the input String
	 * @param str
	 * @return
	 */
	public static String reverseSentence(String str) {
		if (str == null) throw new NullPointerException();
		String[] sArray = str.split(" ");
		if (sArray.length == 1) return str;
		List<String> sList = Arrays.asList(sArray);
		Collections.reverse(sList);
		StringBuilder sb = new StringBuilder(128);
		for (int i = 0; i < sList.size() ; i++) {
			//1st bucket in the list starts with an index of '0' 
			sb.append(sList.get(i));				
			if (sList.size()-1 != i)
				sb.append(" " );
		}
		return sb.toString();
	}
	
}