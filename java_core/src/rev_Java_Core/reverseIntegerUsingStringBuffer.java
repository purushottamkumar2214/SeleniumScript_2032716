package rev_Java_Core;

public class reverseIntegerUsingStringBuffer {

	public static void main(String[] args) {
		int abc=12345;
		
		StringBuffer sb= new StringBuffer(String.valueOf(abc));
		
		System.out.println(sb.reverse());
		
		//System.out.println(abc);

	}

}
