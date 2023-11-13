package java_core_prg;

import java.util.HashSet;
import java.util.Set;

public class duplicateFindElementUsingSet {

	public static void main(String[] args) {
		String str1[]= {"kamal", "amit", "kala", "pankaj", "kamal", "kamal", "amit"};
		
		Set<String> name=new HashSet<String>();
		for (int i=0;i<str1.length;i++)
		{
		if (name.add(str1[i])==false)
		{
			System.out.println(str1[i]);
		}

	}
	}
}
