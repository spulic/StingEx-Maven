package NumberExamples;

public class NumberExamples {
	/**
	 * 1. find sum and first occurrence of the result
	 */
	
	public static void main (String[] args) {
		int[] i = {2,3,2,7,4};
		int[] res = sum(i,11);
		System.out.println(res[0] + ":::" + res[1]);
	}
	
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
	
}
