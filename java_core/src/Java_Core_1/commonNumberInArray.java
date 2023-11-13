package Java_Core_1;

public class commonNumberInArray {

	public static void main(String[] args) {
		int[] array1= {12,3,20,14,6,21,27,28,7,9};
		
		int[] array2= {20,20,12,24,1,9,7};
		
		for (int i=0;i< array1.length;i++)
		{
			for (int j=0; j<array2.length;j++)
			{
			if (array1[i]== array2[j])
			{
				System.out.println(array1[i]);
				
			}
		}
		}
	}

}
