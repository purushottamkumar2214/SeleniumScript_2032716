package java_core_prg;

public class SplitString_Prog {

	public static void main(String[] args) {
		
		String st1= new String("this is new string");
		String[]SplittedString=	st1.split("new");
		
		System.out.println(SplittedString[0]);
		System.out.println(SplittedString[1]);
		//System.out.println(SplittedString[3]);

	}

}
