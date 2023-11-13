package Java_Core_1;

public class RepetletterWord {

	public static void main(String[] args) {
		
		String str1= "commomn";
		int count = 0;
		char []ch= str1.toCharArray();		
		for (int i=0;i< str1.length();i++)
		{
		 for(int j=i+1;j< str1.length();j++)
		 {
			// count=0;
			 if (ch[i]==ch[j])
			 {
				 System.out.println(ch[i]);
				 
				 count++;
				 
			 }
			 if (count>1)
			 {
			System.out.println(count);
			 }
		 }
			
		// System.out.println(count);
		 
		}
		
		

	}

}
