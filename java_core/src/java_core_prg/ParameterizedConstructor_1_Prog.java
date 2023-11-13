package java_core_prg;

public class ParameterizedConstructor_1_Prog extends SuperKeyword_Prog {
	int a,b,c;
	public ParameterizedConstructor_1_Prog(int a, int b)
	{ 
		super(a,b, b);
		this.a=a;
		this.b=b;
	}
	public int sum()
	{
		c=a+b;
		
		return c;
	}

}
