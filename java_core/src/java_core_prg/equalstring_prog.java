package java_core_prg;

public class equalstring_prog {

	public static void main(String[] args) {
		String s1= "same";
		
		String s2= "same";
		
		System.out.println(s1==s2);
		
		String st1= new String("same");
		
		System.out.println(s1==st1);
		
		// to make it true use .equals
		
		System.out.println(s1.equals(st1));
		
		String s7="computer";
		String s8= "computer";
		
		String s06="computer1";
		
		s06=s8;
		
		System.out.println(s7==s8);
	}

}
