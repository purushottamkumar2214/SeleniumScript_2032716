package Java_Core_1;

public class rotateInt {

	public static void main(String[] args) {
		
		int array1[]= {21,1,2,4,7,3,12};
		int temp;
		temp= array1[0];
		for (int i=1;i< array1.length;i++)
		{
			array1[i-1]=array1[i];
			
		}
		
		array1[array1.length-1]= temp;
		
		for (int j=0;j< array1.length;j++)
		{
			System.out.println(array1[j]);
		}
		
		

	}

}
