package java_core_prg;

public class replacecharacter {

	public static void main(String[] args) {
		
		String st="testing is the klakslg / tshadh wqoi /  /wqiuiu";
		
		String newString= st.replace('g', ' ');
		
		String newString1= st.replaceAll("/" , "specialchar");
		System.out.println(newString);

	}

}
