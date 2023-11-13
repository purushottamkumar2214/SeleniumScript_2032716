package Java_Core_1;

import java.util.Arrays;

public class reverseArray {

	public static void main(String[] args) {
		
		int array1[]= {2,12,4,22,7,99};
		
		int i=0,j=array1.length-1;
		
		while(i<j)
		{
			int temp;
			
			temp= array1[i];
			
			array1[i]=array1[j];
			
			array1[j]=temp;			
			i++;
			j--;
		}
		for (int j1=0;j1< array1.length;j1++)
		{
		System.out.println(array1[j1]);
	}
	
	}
}
