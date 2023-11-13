package java_core_prg;

public class StringSplit_Prog {

	public static void main(String[] args) {
		String s1= "this is 'code' String 1";
		//s1.split("'");
		
		String []SplittedString=s1.split("String");
		
		// after split SplittedString[0]= this is 'code' 
		
		// SplittedString[1]="  1"
		for (int i=0;i<SplittedString.length;i++)
		{
		System.out.println(SplittedString[i]);
		}
		
		String []SplittedString1=SplittedString[0].split("'");
		
		// after split SplittedString1[0]=this is 
		// after split SplittedString1[1]=code
		
		for (int i=0;i<SplittedString1.length;i++)
		{
		System.out.println(SplittedString1[i]);
		}
		
		String finalOutput= SplittedString1[1];
		System.out.println(finalOutput);
	}

}
