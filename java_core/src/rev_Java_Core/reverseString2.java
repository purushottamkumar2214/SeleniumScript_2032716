package rev_Java_Core;

public class reverseString2 {
	
	public static void main(String[] args) {
	
	String str="webdriver";
	
	for (int i=0;i<=str.length();i++)
	{
	for (int j=i+1;j<str.length()	;j++)
	{
		if (str.charAt(i)==str.charAt(j))
		{
			System.out.println(str.charAt(i));
		}
	}
	}
}
}
