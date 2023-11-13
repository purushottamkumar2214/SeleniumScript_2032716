package java_core_prg;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.jar.Attributes.Name;

public class ArrayList_Prog {

	public static void main(String[] args) {
		
		ArrayList <String> a= new ArrayList();
		
		a.add("abc");
		
		a.add("1234");
		
		a.add("sanjay");
		
		a.add("kamal");
		
		for (int i=0;i<a.size();i++)
		{
			System.out.println(a.get(i));
		}
		
		for (String i:a)
		{
		System.out.println(i);
		}
		
		// fetch particular position value from array list
		
		System.out.println(a.get(2));
		
		// item present in array list
		
		System.out.println(a.contains("kamal"));
		
		//how to convert array into arraylist
		
		//int []a1= new int[10];
		
		int []a1= {1,22,33,11,12,7,21,22,18,20};
		
		String[] name= {"abc","kamal", "sanjay"};
		
		List<String> stringValue= Arrays.asList(name);
		
		System.out.println(stringValue.contains("kamal"));
		
		ArrayList <Integer> number= new ArrayList<Integer>();
		
		number.add(2);
		number.add(20);
		number.add(4);
		number.add(8);
		
		System.out.println(number.contains(7));
		
		ArrayList <Float> number2= new ArrayList<Float>();
		number2.add(2.1f);
		number2.add(2.2f);
		number2.add(1.1f);
		number2.add(22.1f);
		
		ArrayList <Float> num= new ArrayList<Float>();
		num.add(2.1f);
		num.add(2.2f);
		num.add(1.1f);
		num.add(22.1f);
		
		System.out.println(number2.containsAll(num));
		
		

	}

}
