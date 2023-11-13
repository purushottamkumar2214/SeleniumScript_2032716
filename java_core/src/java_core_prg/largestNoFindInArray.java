package java_core_prg;

public class largestNoFindInArray {

	public static void main(String[] args) {
		int []num= {40,1,2,24,21,9};
		
		int length= num.length;
		int smallest=num[0];
		int largest=num[0];
		
		for (int i=0;i<length;i++)
		{
			if (num[i]<smallest)
			{
				smallest=num[i];
			}
			else if (num[i]>largest)
			{
				largest= num[i];
			}
			
		}
		System.out.println(smallest);
		
		System.out.println(largest);

	}

}
