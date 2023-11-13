package Java_Core_1;

import java.util.HashSet;
import java.util.Set;

public class duplicateStringSet {

	public static void main(String[] args) {
		String str[]= {"kamal", "kala", "sanjay", "kalu", "sanjay", "kamal"};
		
		int length= str.length;
		
		Set <String> st1= new HashSet<String>();
		
		for (int i=0; i< length;i++)
		{
		
			
			if (st1.add(str[i])== false)
			{
				System.out.println(str[i]+" "+"duplicate element");
			}
		}
	}

}
