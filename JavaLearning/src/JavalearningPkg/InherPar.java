package JavalearningPkg;

public class InherPar {
	
    public InherPar()
	
	{
    	this(10,20);
		System.out.println("Parent default value");
		
	}
	
	public InherPar(int a)
	
	{
		this(10,20,30);
		System.out.println("Parent One parameter value");
		
	}
	
	public InherPar(int b, int c)
	
	{
		System.out.println("Parent two parameter value");
		
	}
	
	public InherPar(int d, int f, int g)
	
	{
		this();
		System.out.println("Parent three parameter value");
		
	}

}
