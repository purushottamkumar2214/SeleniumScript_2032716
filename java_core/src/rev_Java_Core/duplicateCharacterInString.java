package rev_Java_Core;

public class duplicateCharacterInString {

	public static void main(String[] args) {
		String str= "selenium";
		
		int length= str.length();
		
		for (int i=0;i<length;i++)
		{
			for (int j=i+1;j<length;j++)
			{
				if(str.charAt(i)==str.charAt(j))
				{
					System.out.println(str.charAt(j));
				}
			}
		}

	}

}
