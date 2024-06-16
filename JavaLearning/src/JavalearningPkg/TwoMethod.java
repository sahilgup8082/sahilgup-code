package JavalearningPkg;

public class TwoMethod {
	
	String name;
	int rnum;
	float percntage;
	
	public void Student1()
	
	{
		System.out.println("Show details for Student1-");
		
	}
	
	public void Student2()
	
	{
		
		System.out.println("Show details for Student2-");
	}
	
public static void main(String[] args)

{
 TwoMethod std = new TwoMethod();
 std.Student1();
 std.name =  "Sahil";
 std.rnum = 10;
 std.percntage = 95.5f;
 System.out.println("Name of the student- " + std.name);
 System.out.println("Roll number of the student- " + std.rnum);
 System.out.println("Percentage- " + std.percntage);
 std.Student2();
 std.name =  "Rohit";
 std.rnum = 11;
 std.percntage = 98.5f;
 System.out.println("Name of the student- " + std.name);
 System.out.println("Roll number of the student- " + std.rnum);
 System.out.println("Percentage- " + std.percntage);
 
}
}
