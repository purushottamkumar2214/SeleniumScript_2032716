package java_core_prg;

class finaloverride1
{
	public final void show()
	{
		System.out.println("this is show method of parent");
	}
	
}
public class finaloverride extends finaloverride1 {
	
	// final method can't be override
/*public void show()
{
	
}
*/
	public static void main(String[] args) {
		
	finaloverride1 obj= new finaloverride1();
	obj.show();

	}

}
