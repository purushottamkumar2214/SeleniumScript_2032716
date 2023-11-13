package rev_Java_Core;

public class rotateString {

	public static void main(String[] args) {
		String str="kamal";
		
		String str3="";
		
		String str4="";
		
		String str5="";
		
		str3= str.substring(2);
		
		str4= str.substring(0, 2);
		
		//System.out.println(str4);
		
		str5=str3+str4;
		
		System.out.println(str5);
	}
}
