package java_core_prg;

public class trycatch {
// Finally: It is the block present in a program where all the codes written inside it get executed irrespective of handling of exceptions. Example:
// Is it possible that the ‘finally’ block will not be executed? If yes then list the case.	
	public void show()
	{
		try {
			int variable = 5;
			System.exit(variable); // code will get terminated on this point and finally will not execute
			}
			catch (Exception exception) {
			System.out.println("Exception occurred");
			}
			finally {
			System.out.println("Execution of finally block");
			}
	}
	public static void main(String[] args) {
		
		trycatch obj= new trycatch();
		
		obj.show();

	}

}
