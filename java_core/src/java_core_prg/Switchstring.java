package java_core_prg;

public class Switchstring {
	String str;
	public void enterstring(String str)
	{
		this.str= str;
		
		switch(str){
		
			case "abc":
			{
				System.out.println("this is abc");
				break;
			}
				
		/*	case "abc1":
				return "this is abc1";
			case "abc2":
				return "this is abc2";
				
			default:
				return "no match";
			*/
		
		}
	}

}
