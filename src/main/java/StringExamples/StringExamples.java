package StringExamples;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

public class StringExamples {
	
	/**
	 * 1. Returns first two characters of the string
	 * 2. Swap last two characters
	 * 3. Reveres the input String
	 * 4. Find duplication words in a String and it's count
	 * 5. Read file, find duplicates and arrange words from most occurred to least
	 */
	
	/**
	 * Returns first two characters of the string
	 * @param str
	 * @return
	 */
	public static String firstTwo(String str) {
		if (str.length() < 2) return str;
		return str.length()>0?str.substring(0,2):str;
	}


	/**
	 * swap last two characters
	 * @param s
	 * @return
	 */
	@SuppressWarnings("unused")
	public static String swapLastTwoChar(String s) {
		//Minimum expected length to create objects to proceed
		if (s.length() < 2) return s;
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
	
	/**
	 * Find duplicate words in a String and it's count
	 * @param str
	 * @return
	 */
	public static Map<String,Integer> findDuplicateWords(String str) {
		String[] sWords = str.split(" " );
		Map<String, Integer> mWords = new HashMap<String, Integer>();
		for (String w : sWords) {
			if(mWords.containsKey(w.toLowerCase())) {
				mWords.put(w, mWords.get(w)==null?0:mWords.get(w)+1);
			} else {
				mWords.put(w.toLowerCase(), 0);
			}
		}
		return mWords;
	}
	
	
	public  Map<String, Integer> findDuplicateWordsFromFile(String fileName) throws FileNotFoundException, IOException {
		ClassLoader cl = getClass().getClassLoader();
		File file = new File(cl.getResource(fileName).getFile());
		Map<String, Integer> mWords = new HashMap<String, Integer>();
		try {
			Scanner scanner = new Scanner(file);
			while (scanner.hasNextLine()) {
				String line = scanner.nextLine();
				String[] sWords = line.split(" ");
				for (String s : sWords) {
					if(mWords.containsKey(s)) {
						mWords.put(s, mWords.get(s)+1);
					} else {
						mWords.put(s,0);
					}
				}
			}
			scanner.close();
		} catch (Exception e) {
	
		}
		
		//Sort and display
		Set<Entry<String, Integer>> entrySet = mWords.entrySet();
		List<Entry<String, Integer>> list = new ArrayList<Entry<String, Integer>>(entrySet);
		Collections.sort(list, new Comparator<Entry<String,Integer>>() {
			public int compare(Entry<String,Integer> e1, Entry<String,Integer> e2) {
				return (e2.getValue().compareTo(e1.getValue()));
			}
		});
		System.out.println(list);
		return mWords;
	
	}
}