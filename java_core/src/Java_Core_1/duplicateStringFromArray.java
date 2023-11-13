package Java_Core_1;

public class duplicateStringFromArray {

	public static void main(String[] args) {
		String str[]= {"amit", "kala", "kalu", "kalu", "sanjay", "santosh", "sanjay"};
		
		for (int i=0;i<str.length;i++)
		{
			for (int j=i+1;j<str.length;j++)
			{
				if (str[i]==str[j])
					{
					System.out.println(str[j]);
					}
			}
		}

	}

}
