package Java_Core_1;

public class internString {

	public static void main(String[] args) {
	String str1="purushottam";
	
	String str2= new String("purushottam");
	
	String str3= str2.intern();
	
	System.out.println(str1==str3);

	}

}
