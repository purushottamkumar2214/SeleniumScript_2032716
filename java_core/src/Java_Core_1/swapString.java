package Java_Core_1;

public class swapString {

	public static void main(String[] args) {
		String str="hello";
		
		int fisrtWordLength= str.length();
		
		String str2="world";
		
		int secondWordLength= str2.length();
	
		str= str+str2; //helloworld
		
		str2=str.substring(0,str.length()-secondWordLength);
		
		str=str.substring(secondWordLength);
		
		
		
		System.out.println(str);
		System.out.println(str2);
		

	}

}
