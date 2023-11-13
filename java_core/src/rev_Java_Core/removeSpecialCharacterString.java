package rev_Java_Core;

public class removeSpecialCharacterString {

	public static void main(String[] args) {
		String str1= "this is *&()))@!@# selenium";
		
		str1= str1.replaceAll("[^a-z ]", "");
		
		System.out.println(str1);

	}

}
