package JavalearningPkg;

public class InherChild extends InherPar{
	
	public InherChild()
	
	{
		this(10);
		System.out.println("child default value");
		
	}
	
	public InherChild(int x)
	
	{
		this(10,20);
		System.out.println("child one parameter value");
		
	}
	
	public InherChild(int y, int z)
	
	{
		super(10);
		System.out.println("child two parameter value");
		
	}
	
	public InherChild(int p, int q, int r)
	
	{
		this();
		System.out.println("child three parameter value");
		
	}
	
	public static void main(String[] args)
	
	{
		
		InherChild val=new InherChild(10,20,30);
		
	}

}
