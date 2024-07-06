package JavalearningPkg;

public final class debugPrac {
	int abc = 100;
	 final int xyz =100;
	 static int pqr=400;
	
	public void testOne() 
	{
		
		System.out.println("Method one print1");
		System.out.println("Method one print2");
	}
	
	public void testTwo()
	{
		int bcd;
		System.out.println("Method two print1");
		System.out.println("Method two print2");
		
	}
	
	public void testThree()
	{
		abc=abc+1;
		System.out.println("Method three print1");
		
	}
	
	public static void testFour()
	{
		int pqr= 500;
		System.out.println("I am static");
	}
	public static void main(String[] args)
	{		
		System.out.println("debug start");
		debugPrac debug = new debugPrac();
		debug.testThree();
		debug.testOne();
		System.out.println("printing done for method 3 and 1");
		System.out.println("Print method 1 variable " + debug.abc);
		System.out.println("Print method 3 variable " + debug.xyz);
		debug.testTwo();
		System.out.println("printing done for method 2 only");
		debugPrac.testFour();
		System.out.println(debugPrac.pqr);

		
	}

}
