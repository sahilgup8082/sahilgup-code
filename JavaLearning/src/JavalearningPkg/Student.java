package JavalearningPkg;
public class Student {
	int age;
	int rollno;
	public void DisplayOne()
	{
		System.out.println("Welcome to all of you in DTHub group");
	}

	public void DisplayTwo()
	{
		System.out.println("Automation is very easy and definately will learn");
	}
	public static void main(String[] args)
	{
		Student std = new Student();
		std.DisplayOne();
		std.DisplayTwo();
		std.age = 18;
		std.rollno = 11;
		System.out.println("Age of student is: " + std.age);
		System.out.println("Roll number of student is: " + std.rollno);	
	}
}
