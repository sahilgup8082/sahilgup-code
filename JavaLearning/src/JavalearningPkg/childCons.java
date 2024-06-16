package JavalearningPkg;

public class childCons extends ParentCons{
	
	public childCons()
	
	{
		System.out.println("child default");
		
	}
	
	public childCons(int x)
	
	{
		System.out.println("child one"); 
		
	}
	
	public static void main(String[] args) {
		
		childCons val1 = new childCons(1);  //parent default constructor without super and if we add super then default constructor will not call.
		
		
	}

}
