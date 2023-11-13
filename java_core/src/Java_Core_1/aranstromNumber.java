package Java_Core_1;

public class aranstromNumber {

	public static void main(String[] args) {
		
		int num=407;
		int t=num;
		int cube=0;
		int remainder;
		
		while(num>0)
		{
			remainder= num%10;
			
			num=num/10;
			
			cube=cube+(remainder*remainder*remainder);
		}
		
		if (t==cube)
		{
			
			System.out.println("anstrom number");
		}
		else
		{
			System.out.println("not amronstrong number");
		}

	}

}
