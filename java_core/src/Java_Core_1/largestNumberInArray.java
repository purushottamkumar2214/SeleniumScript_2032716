package Java_Core_1;

import java.util.Arrays;

public class largestNumberInArray {

	public static void main(String[] args) {
		int []num= {12,1,24,24,28};
		
		Arrays.sort(num);
		
	//	System.out.println(Arrays.toString(num));
		
		int arraySize= num.length;
		
		System.out.println(num[arraySize-2]);

	}

}
