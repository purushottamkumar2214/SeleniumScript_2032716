package Java_Core_1;

public class StringComparasion {

	public static void main(String[] args) {
		String str1="computer";
		
		String str2="computer";
		
		System.out.println(str1==str2);  //true
		
		String str3= new String("computer");
		String str4= new String("computer");
		
		System.out.println(str1==str3); // false
		
		System.out.println(str3==str4); // false

	}

}
