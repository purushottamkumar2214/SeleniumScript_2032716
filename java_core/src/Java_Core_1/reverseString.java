package Java_Core_1;

public class reverseString {

	public static void main(String[] args) {
		String str1= "amit";
		String str2="";
		char ch;
		
		for (int i=0; i<=str1.length()-1;i++)
		{
			
			ch= str1.charAt(i);
			
			str2=ch+str2;
		}
		
		System.out.println(str2);

	}

}
