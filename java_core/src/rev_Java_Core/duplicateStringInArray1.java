package rev_Java_Core;

public class duplicateStringInArray1 {

	public static void main(String[] args) {
		String[] str= {"kamal", "amit", "kala", "kamal", "santos"};
		
		int length= str.length;
		
		for (int i=0;i< length;i++)
		{
			for (int j=i+1; j<length;j++)
			{
				if (str[i].equals(str[j]))
				{
					System.out.println(str[j]);
				}
			}
		}
	}

}
