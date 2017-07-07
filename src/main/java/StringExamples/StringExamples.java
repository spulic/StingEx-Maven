package StringExamples;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class StringExamples {
	
	public static String sentence = "No signal for current input";

	public static void main(String[] args) {
		firstTwo("name");
		buggyBread();
		
		 LocalDate date = LocalDate.now();
		  DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy MM dd");
		  String text = date.format(formatter);
		  LocalDate parsedDate = LocalDate.parse(text, formatter);
		  System.out.println(parsedDate);
	}
	
	
	public static String firstTwo(String str) {
		return str.length()>2?str.substring(0,2):str;
	}


	//swap two characters
	public static String swapLastTwoChar(String s) {
		String result = s;
		if(s != null && s.length() > 1) {
			char[] ch = s.toCharArray();
			ch[ch.length-2] = s.charAt(s.length()-1);
			ch[ch.length-1] = s.charAt(s.length()-2);
			result = result.valueOf(ch); 
		}
		
		return result;
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