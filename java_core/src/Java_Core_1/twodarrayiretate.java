package Java_Core_1;

import java.util.Scanner;

public class twodarrayiretate {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		System.out.println("enter no. of rows");
		int row=	sc.nextInt();
		System.out.println("enter no. of column");
		int column= sc.nextInt();
		
		int data[][]= new int[row][column];
		for (int i=0;i< row;i++)
		{
			for (int j=0;j<column;j++)
			{
				data[i][j]= sc.nextInt();
			}
		}
		
		for (int i=0;i< row;i++)
		{
			for (int j=0;j<column;j++)
			{
				System.out.print(data[i][j]+"\t");
			}
			System.out.println();
		}

	}

}
