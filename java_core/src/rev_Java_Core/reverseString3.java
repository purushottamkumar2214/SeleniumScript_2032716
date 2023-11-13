package rev_Java_Core;

import java.util.Arrays;

public class reverseString3 {
	
	String str="web driver";
	public void splitString()
	{
		String[] str1= str.split("web");
		for (int i=0;i<str1.length-1;i++)
		{
		System.out.println(str1[i]);
		}
	}
	
	public static void main(String[] args) {
	reverseString3 obj= new reverseString3();
	
	obj.splitString();
}
}
