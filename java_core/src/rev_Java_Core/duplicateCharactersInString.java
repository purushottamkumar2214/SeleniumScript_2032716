package rev_Java_Core;

public class duplicateCharactersInString {

	public static void main(String[] args) {
		String str="selenium knjmk k";
		
		int length= str.length();
		
		for (int i=0;i<length;i++)
		{
			int count=0;
		//	int j=0;
			for (int j=i+1;j<length;j++)
			{
				
				if (str.charAt(i)==str.charAt(j))
				{
					System.out.println(str.charAt(j));
					
					//count++;
				}
				
				
			}
			
		}

	}

}
