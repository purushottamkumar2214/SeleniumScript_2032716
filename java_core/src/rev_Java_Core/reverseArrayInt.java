package rev_Java_Core;

public class reverseArrayInt {

	public static void main(String[] args) {
		int []num= {1,2,3,4,5,6,7};
		
		int []num1=new int[7];
		
		int j=0;
		
		int length= num.length;
		
		for (int i=length-1;i>=0;i--)
		{
			
			num1[j]=num[i];
			
			j++;
		}
		
		
		for (int k=0;k<num1.length;k++)
		{
			
			System.out.println(num1[k]);
		}

	}

}
