package rev_Java_Core;

public class rotateArrayInt {

	public static void main(String[] args) {
		int []num = {1,2,3,4,5,6,7}; //7
		
		int [] temp=new int[2];
		int y=0;
		
		for (int i=0;i<2;i++)
		{
			temp[i]= num[i];
		}
		
		
		
		for (int k=2;k<num.length;k++)  //7 //
		{
			num[k-2]= num[k];
		}
		
		for (int n=num.length-2; n<num.length;n++)
		{
			
			num[n]=temp[y];
			y++;
		}
		
		for (int i1= 0;i1< num.length;i1++)
		{
			System.out.println(num[i1]);
			
		}
		
		

	}

}
