package Java_Core_1;

public class rotateTwonumberInteger {
	
	public void rotateNo(int n)
	{
		
		int array1[]= {1,4,9,20,24,22,26};
		
		int temp[] = new int[n];
		
		for (int i=0; i<n; i++)
		{
			temp[i]= array1[i];
			
		//	System.out.println(temp[i]);
		}
		
		//System.out.println(array1.length);
		
		for (int j=n;j< array1.length;j++)
		{
			array1[j-n]=array1[j];
			
		 System.out.println(array1[j-n]);
		}
		
		
		for (int k=array1.length-n; k< array1.length;k++)
		{
			
			array1[k]= temp[k-(array1.length-n)];
		
			
			System.out.println(array1[k]);
			
		}
	
	/*	
		for (int k1=0;k1< array1.length;k1++)
		{
			System.out.print(array1[k1]+ " ");
		}
 */
	}
	
	public static void main(String[] args) {
		
		rotateTwonumberInteger rt= new rotateTwonumberInteger();
		
		rt.rotateNo(2);
	
	}
}
