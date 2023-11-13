package rev_Java_Core;

public class reverseString {

	public static void main(String[] args) {
		String str1="this is demo";
		
		String str2="";
		
		for (int i= str1.length()-1;i>=0;i--)
		{
			str2= str2+str1.charAt(i);
			//System.out.println(str2);
		}

		System.out.println(str2);
	}

}
