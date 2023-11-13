package java_core_prg;

public class startabc {

	
	// int i,j;
	public static void main(String[] args) {
		int alpha=65;
		for(int i=1;i<=5;i++)
		{
			for (int j=1;j<=i;j++)
			{
				System.out.print((char)(alpha+j-1)+" ");
			}
			
			System.out.println();
		}
	}

}
