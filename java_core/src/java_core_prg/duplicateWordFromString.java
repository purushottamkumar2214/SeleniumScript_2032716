package java_core_prg;

public class duplicateWordFromString {

	
	public static void main(String[] args) {
		
	//	String str="this is name is kamal name kamal";
		
	//	String str1[]=str.split(" ");
		String str1[]= {"this", "is", "name", "is", "kamal", "name", "kamal"};
		
		int length=str1.length;
		
		System.out.print(length);
		
		for (int i=0; i<length;i++)
		{
		//	System.out.println(str1[i]);
		}
		
		for (int j=0;j<length;j++)
		{
			int count =0;
			for (int k=j+1;k<length;k++)
			{
				if (str1[j]==(str1[k]))
				{
					System.out.println("duplicate element" + str1[k]);
					//System.out.println(str1[j]+" "+ count++);
				}
			}
		}
		

	}

}
