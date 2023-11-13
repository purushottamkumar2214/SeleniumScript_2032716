
package java_core_prg;

public class missingNumberFind {

	public static void main(String[] args) {
		int[] num= {1,2,3,4,5,6,7,8};
		int sum1=0;
		int sum2=0;
		int No;
		System.out.println(num.length);
		for (int i=0;i< num.length;i++)
		{
			
			sum1=sum1+ num[i];
			
		}
		
		System.out.println(sum1);
		
		for (int j=1;j<=num.length+1;j++)
		{
			sum2= sum2+j;
		}
		
		System.out.println(sum2);
		
		No= sum2-sum1;
		
		System.out.println(No);

	}

}
