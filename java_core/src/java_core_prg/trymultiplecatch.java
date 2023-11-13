package java_core_prg;

public class trymultiplecatch {

	int i;
	int n=0;
	int answer;
	//int arraySize;
	int arr1[]= new int[4];
	public void answer()
	{
		try
		{
		for (i=0;i<=arr1.length;i++)
		{
			arr1[i]= i/n;
		}
		}
		catch (ArrayIndexOutOfBoundsException e) {
			
			System.out.println(e.getMessage());
		}
		catch (ArithmeticException e)
		{
			System.out.println(e.getMessage());
		}
		catch (Exception e)
		{
			System.out.println("other exception");
		}
	}
	public static void main(String[] args) {
		
		trymultiplecatch obj= new trymultiplecatch();
		
		obj.answer();
				
	}

}
