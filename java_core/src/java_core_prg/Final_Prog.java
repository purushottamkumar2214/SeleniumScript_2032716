package java_core_prg;

public class Final_Prog {
	
	final int a;
	
	public Final_Prog(int a) {
	this.a=a;	
	}
	public void show()
	{
	System.out.println(a);
	}
	public static void main(String[] args) {
		
		Final_Prog obj= new Final_Prog(4);

		obj.show();

	}

}
