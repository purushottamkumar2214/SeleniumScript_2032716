package Java_Core_1;

public class vowelString {

	public static void main(String[] args) {
		
		String str1="amit";
		
		char ch;
		
		String str2;
		
		for (int i=0;i<str1.length();i++)
		{
			ch =str1.charAt(i);
			
			if (ch== 'a' || ch=='e' || ch=='i' || ch== 'o' || ch=='u')
				{
				System.out.println(ch);
				}
				}

	}

}
