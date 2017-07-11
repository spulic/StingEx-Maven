package com.spulic.core;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Map;
import java.util.Properties;

public class NumberExamples {
	/**
	 * 1. find sum and first occurrence of the result
	 * 2. infinite random integer values, arrange in ascending order
	 * 3. multi dimension array - ways to declare, instantiate & initialize
	 * 4. methods - useful ones
	 **/
	public static void main (String[] args) {
		//array declaration, instantiation, initialization
		//int[] i;
		//i= new [10];
		//int[] i = new int[10];
		//int[] i = {10,20};
		
		int[] val = {5,8,6,34,76,34,2,9,46,78,33};
		order(val);
		multidimension();
		methods();
		printArray(new int[] {3,5,9,10,3});
	}
	
	/**
	 * 1. Find sum and first occurrence of the result
	 * @param num
	 * @param result
	 * @return
	 */
	public static int[] sum(int[] num, int result) {
		int[] res = new int[2];
		boolean found = false;
		for(int i=0; i<num.length-1; i++) {
			for(int j=i+1;j<num.length;j++) {
				if(num[i]+num[j] == result) {
					res[0] = num[i];
					res[1] = num[j];
					found = true;
					break;
				}
			}
			if(found==true) {
				break;
			}
		}
		System.out.println(res);
		return res;
	}
	
	/**
	 * 2. Infinite random integer values, arrange in ascending order
	 * @param val
	 * @return
	 */
	public static int[] order(int[] val) {
		int res[] = val;
		System.out.println("UnSorted: ");
		for(int i=0; i<res.length; i++) {
			System.out.print(res[i]);
			if(i!=res.length-1)
				System.out.print(",");
		}
		System.out.println(System.lineSeparator());
		Arrays.sort(res);
		System.out.println("Sorted: ");
		for(int i=0; i<res.length; i++) {
			System.out.print(res[i]);
			if(i!=res.length-1)
				System.out.print(",");
		}
		System.out.println(System.lineSeparator());
		return res;
	}
	
	/**
	 * 3. Multi dimension arrays
	 */
	public static void multidimension(){
		int[][] ar = {{1,2,3},{4,5,6},{7,8,9}}; //3 rows and 3 columns
		for(int i=0; i<3; i++) {
			for(int j=0; j<3; j++) {
				System.out.print(ar[i][j]+" ");
			}
			System.out.println();
		}
		//Same as above
		int[][] arrDup = new int[3][3];
		arrDup[0][0] = 1;
		arrDup[0][1] = 2;
		arrDup[0][2] = 3;
		arrDup[1][0] = 4;
		arrDup[1][1] = 5;
		arrDup[1][2] = 6;
		arrDup[2][0] = 7;
		arrDup[2][1] = 8;
		arrDup[2][2] = 9;
		System.out.println(System.lineSeparator());
		for(int i=0; i<3; i++) {
			for(int j=0; j<3; j++) {
				System.out.print(arrDup[i][j]+" ");
			}
			System.out.println();
		}
	}
	
	/**
	 * 4. Methods - useful ones
	 */
	public static void methods() {
		char[] copyFrom = {'o','r','a','n','g','e','d'};
		char[] copyTo = new char[5];
		System.arraycopy(copyFrom, 1, copyTo, 0, 5); //Copies a value of 'range'
		System.out.println(System.lineSeparator());
		System.out.println("array copy: " + new String(copyTo));
		
		//getenv();
		Map<String, String> sys = System.getenv();
		System.out.println(sys);
		System.out.println("USERDOMAIN: " + System.getenv("USERDOMAIN"));
		
		//getProperty(String);
		System.out.println("lineSeparator: " + System.lineSeparator());
		
		Properties prop = System.getProperties();
		System.out.println("Properties: " + prop);
		
		System.out.println(System.lineSeparator());
		System.out.println("java.runtime.version: " + System.getProperty("java.runtime.version"));
		
		System.out.println(System.lineSeparator() + "Cloning Arrays");
		
		//cloning arrays
		int ia[][] = { {1,2}, null };
        int ja[][] = ia.clone();
        //Arrays referenced by ia and ja are two different variables
        System.out.print((ia == ja) + " ");
        //showing that the int[] array that is ia[0] and the int[] array of ja[0] are the same array
        System.out.println((ia[0] == ja[0] && ia[1] == ja[1]) + " " + ia[0][0] + " " + ja[0][0]);
        
        System.out.println(System.lineSeparator() + "Arrays.equals check..");
        int ib[] = {1,2,3};
        int jb[] = {1,3,2};
        //Arrays are equals if they have same lengh and have same values correspondingly
        System.out.println("Equals: " + Arrays.equals(ib, jb));
        
        //binary Search
        System.out.println(System.lineSeparator() + "Arrays Binary Search...");
        //Sort the array first
        int ic[] = {1,4,7,6,10,39,45,24,2,9};
        Arrays.sort(ic);
        int i = Arrays.binarySearch(ic, 24);
        System.out.println("Binary Search result: " + i);
        
        //Can I sort an array which is marked as final
        //Secondly lets try to modify the array marked as final
        final int[] id = {1,3,4,2};
        Arrays.sort(id);
        System.out.println(System.lineSeparator() + "final sorted array: ");
        printArray(id);
        Arrays.fill(id,3,4,5);
        System.out.println(System.lineSeparator() + "after filling the array with an additional value: ");
        printArray(id);
        System.out.println(System.lineSeparator());
		
        
    }
	
	public static void printArray(int[] arr) {
		System.out.println(Arrays.toString(arr));
		StringBuffer sb = new StringBuffer(128);
		for(int i : arr) {
			sb.append(i).append(" ");
		}
		System.out.println(sb.toString());
	}
}
