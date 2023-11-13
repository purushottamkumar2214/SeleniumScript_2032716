package java_core_prg;

public class duplicateFindElement {

	public static void main(String[] args) {
		String str1[]= {"kamal", "amit", "kala", "pankaj", "kamal"};
		
		int length=str1.length;
		
		System.out.println(length);
		
		for (int i=0;i< length;i++)
		{
			for (int j=i+1;j< length;j++)
			{
				if (str1[i].equals(str1[j]))
				{
					System.out.println(str1[j]);
				}
			}
			
		}

	}

}
