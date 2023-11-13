package java_core_prg;

public class String1_prg {

	public static void main(String[] args) {
		
		// String is an object that represent the sequence of characters
		
		String s1= "this is String 1";
		
		String s2= "this is String 1";
		
		String st1= new String("this is new string");
		
		String st2= new String("this is new string");
		
		int size= st1.length();
		
		System.out.println(size);
		
		for (int i=0;i<size;i++)
		{
		
			System.out.println(st1.charAt(i));
		}
		
		
		//reverse the string
		
		st1.split(" ");
		
		for (int i=size-1;i>=0;i--)
		{
			
			System.out.println(st1.charAt(i));
		}
		

	}

}
