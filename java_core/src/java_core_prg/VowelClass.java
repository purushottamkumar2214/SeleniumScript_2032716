package java_core_prg;

public class VowelClass {
	
	private char ch;
	
	public VowelClass(char ch) {
		this.ch= ch;
	}
	
	public void FindVowel()
	{
		if (ch=='a' || ch=='e' || ch=='i'|| ch=='o' || ch=='u')
		{
			System.out.println("this is vowel "+ ch);
		}
		
		else
		{
			System.out.println("this is consonent");
		}
	}
	

}
