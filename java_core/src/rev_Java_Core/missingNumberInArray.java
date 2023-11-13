package rev_Java_Core;

public class missingNumberInArray {

	public static void main(String[] args) {
		
		
		int num[]= {1,3,4,5,6,7};
		
		int sum=0;
		
		int sum1=0;
		
		int missingNo;
		
		for (int i=0;i< num.length;i++)
		{
			sum=sum+ num[i];
		}
		
		for (int i=1;i<=7;i++)
		{
			sum1= sum1+i;
		}
		
		missingNo= sum1-sum;
		
		System.out.println(missingNo);

	}

}
