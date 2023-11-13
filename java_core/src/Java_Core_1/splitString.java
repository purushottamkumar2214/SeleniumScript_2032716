package Java_Core_1;

public class splitString {

	public static void main(String[] args) {
		String str= "this_is_new_class";
		
		String splittedString[]=str.split("_");
		//String splittedString1[]=str.split(" ");
		
		for (int i=0;i<splittedString.length;i++)
		{
		System.out.print(splittedString[i]+" ");
		}

	}

}
