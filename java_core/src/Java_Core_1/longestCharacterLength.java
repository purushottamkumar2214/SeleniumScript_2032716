package Java_Core_1;

import java.util.Arrays;

public class longestCharacterLength {

	public static void main(String[] args) {
		String[] str1= {"kamal","amit jjoqjejoeiqi0130922qq", "kala", "sanjayjkjkjjkj"};
		int array1[] = new int[str1.length];
		
		
		for (int i=0;i<str1.length;i++)
		{
			int charLength= str1[i].length(); //5
			
			array1[i]=charLength;
			
			//System.out.println(array1[i]);
			
		}

		
	/*	for (int j=0;j< array1.length;j++)
		{
		
		System.out.println(array1[j]);
		}
		*/
		Arrays.sort(array1);
		
		System.out.println("longest no is "+ array1[array1.length-1]);
		
	}

}
