package rev_Java_Core;

public class reverseString1 {

	public static void main(String[] args) {
		String str="amit kumar";
		
		int length= str.length();
		
		String str2="";
				
		
		for (int i=length-1;i>=0;i--)
		{
			str2= str2+str.charAt(i);
		}
		
		System.out.println(str2);

		StringBuffer sb= new StringBuffer(str);
		
		System.out.println(sb.reverse());
	}
	
	

}
