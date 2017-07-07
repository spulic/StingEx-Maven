package StringExamples;

import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class StringExamples {
	
	public static String sentence = "No signal for current input";

	public static void main(String[] args) {
		String s = firstTwo("four");
		System.out.println(s);
		s = swapLastTwoChar("four");
		System.out.println(s);
	}
	
	
	public static String firstTwo(String str) {
		return str.length()>0?str.substring(0,2):str;
	}


	//swap last two characters
	@SuppressWarnings("unused")
	public static String swapLastTwoChar(String s) {
		// String starts with 0th element
		System.out.println("length of this 4 character word as String: " + s.length());
		System.out.println("first char of String be in the 0th position: " + s.substring(0,1));
		if (s == null) throw new NullPointerException();
		if (s.length() <= 1) return s;
		char[] ch = s.toCharArray();
		// Arrays starts with 0th element
		System.out.println("lengh of this 4 character word in an Array: " + ch.length);
		System.out.println("first char of Array be in the 0th position: " + ch[0]);
		ch[ch.length-2] = s.charAt(s.length()-1);
		ch[ch.length-1] = s.charAt(s.length()-2);
		return String.valueOf(ch);
	}

	public static String reverseSentence() {
		
		List<String> words = new ArrayList<String>();
		StringBuffer sb = null;
		int i = 0;
		StringTokenizer st = new StringTokenizer(sentence);
		while(st.hasMoreTokens()) {
			String word = st.nextToken(" ");
			words.add(word);
		}
		i = 1;
		if(words!=null) {
			sb = new StringBuffer();
			do {
				sb.append(words.get(words.size()-(i++))).append(" ");
			}while(i<=words.size());
		}
		
		return sb.toString();
	}
	
	public static void buggyBread() {
	 	String s1="Buggy";
        String s2="Bread";
        
        String s3="BuggyBread";
        String s4="BuggyBread";
        
        String s5 = new String("LetsDebug");
        String s6 = new String("LetsDebug");
        
        String s7 = s1+s2;
        String s8 = s5+s6;
        
        
        System.out.println(s3.equals(s7)); // Output 1
        System.out.println(s3==s4); // Output 2
        System.out.println(s5==s6); // Output 3
        System.out.println(s3==s7); // Output 4
        System.out.println("LetsDebug"==s8); // Output 5
        System.out.println(s3.hashCode()==s4.hashCode()); // Output 6
        System.out.println(s5.hashCode()==s6.hashCode()); // Output 7
        
        s7 = s5;
        
        System.out.println(s7.equals("BuggyBread")); // Output 8
        System.out.println(s7.equals("LetsDebug")); // Output 9
        System.out.println(s7 == s5);  // Output 10
	}
}