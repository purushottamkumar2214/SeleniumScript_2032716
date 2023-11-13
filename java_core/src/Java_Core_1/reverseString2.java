package Java_Core_1;

import java.util.Arrays;

public class reverseString2 {

	public static void main(String[] args) {
		
		String str= "this_is_new_word";
		
		String str1[]= str.split("_");
		
	for(int i=0; i<str1.length;i++)
	{
		System.out.println(str1[i]);
	}
	}

}
