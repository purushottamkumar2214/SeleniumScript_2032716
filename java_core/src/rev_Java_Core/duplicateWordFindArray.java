package rev_Java_Core;

public class duplicateWordFindArray {

	public static void main(String[] args) {
		String []str= {"amit", "kamal", "kamal", "ajay"};

		for (int i=0;i< str.length;i++)
		{
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
