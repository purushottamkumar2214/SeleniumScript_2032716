package Java_Core_1;

import java.util.Arrays;

public class secondSmallestNoInArray {
	
	public int findSecondvalue()
	{
		int oneint[]={44,66,99,77,33,22,55};  
		
		Arrays.sort(oneint);
		return oneint[3];
	}

	public static void main(String[] args) {
		
		secondSmallestNoInArray obj= new secondSmallestNoInArray();
		System.out.println(obj.findSecondvalue());
		
		
		
		

	}

}
