package java_core_prg;

public class primeNo {
	
	public boolean checkPrime()
	{
		int num=11;
		
		if (num<=1)
		{
			return false;
		}
		
		for (int i=2;i<num;i++)
		{
			
			if(num%i==0)
			{
				return false;
			
			}
			
			
		
		}
		
	
		return true;
		
		
		
	}

	public static void main(String[] args) {
		
		primeNo p= new primeNo();
		System.out.println("prime no.? ans-"+ p.checkPrime());
		

	}

}
