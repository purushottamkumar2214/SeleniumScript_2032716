package Java_Core_1;

public class rotateString {
	
	public static void main(String args[]) {
		
		String str1="coded";
		
		//dedco
		
		CharSequence str2= str1.subSequence(0, 2);
		
		CharSequence str3= str1.subSequence(2, 5);
		
		System.out.println(str2);
		
		System.out.println(str3);
		
		String str4= str2.toString();
		
		String str5= str3.toString();
		
		String str7= str5+str4;
		
		System.out.println(str7);
		
		
	}

}
