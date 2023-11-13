package rev_Java_Core;

public class revString2 {

	public static void main(String[] args) {
		String str= "selenium";
		
		String str1="";
		
		int length= str.length();
		
		for (int i=length-1;i>=0;i--)
		{
			str1=str1+str.charAt(i);
		}

		System.out.println(str1);
	}

}
