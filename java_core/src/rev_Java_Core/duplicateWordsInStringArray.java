package rev_Java_Core;

public class duplicateWordsInStringArray {

	public static void main(String[] args) {
		String str[]= {"kamal", "amit", "kala", "kamal", "kala"};
	//	String str2[];
		for(int i=0;i<str.length;i++)
		{
			//str2[i]=str[i];
			
			for (int j=i+1;j<str.length;j++)
			{
				if (str[i].equals(str[j]))
				{
					System.out.println(str[j]);
				}
			}
		}

	}

}
