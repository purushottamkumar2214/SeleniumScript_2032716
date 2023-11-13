package java_core_prg;
class methodoverreding1
{
	public void disp()
	{
		System.out.println("this is disp");
	}
	
}
public class methodoverreding extends methodoverreding1{

	public void disp()
	{
		System.out.println("this is disp1");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		methodoverreding obj= new methodoverreding();
		obj.disp();
		
		methodoverreding1 obj2= new methodoverreding1();
		obj2.disp();

	}

}
