package java_core_prg;

public class ReturnType_Prog {

	public String display()
	{
		//System.out.println("this is display method");
		
		return "abc";
		
	}
	
	public int sum() {
		
		int a=2, b=6,c=0;
		
		c= a+b;
		
		return c;
	}
	public static void main(String[] args) {
		
		ReturnType_Prog obj= new ReturnType_Prog();
		
		System.out.println(obj.display());
		
		String output= obj.display();
		
		System.out.println(output);
		
	// 	System.out.println(obj.sum());
		
		int sum1= obj.sum();
		
		System.out.println(sum1);
	}  

}
