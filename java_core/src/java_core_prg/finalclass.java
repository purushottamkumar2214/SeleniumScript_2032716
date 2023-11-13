package java_core_prg;
// final parent class can't be extend in child class
/*final class finalclass2
{
	public void show()
	{
		System.out.println("this is show menthod");
	}
}
*/


class finalclass2
{
	final public void show()
	{
		System.out.println("this is show menthod");
	}
}


public class finalclass extends finalclass2 {

	public static void main(String[] args) {
		
		finalclass obj= new finalclass();
		
		obj.show();

	}

}
