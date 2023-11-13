package Java_Core_1;
class class1
{
	 public void walk () {
        System.out.println("class1");
        		
 }
}
public class practice extends class1{
	 public void walk () {
		 System.out.println("class2");
	 }
	public static void main(String[] args) {
		practice obj= new practice();
		
		obj.walk();

	}

}
