package JavalearningPkg;

public class seleniumAutomation extends sdetCourse {
	
	public void webSelenium()
	
	{
		System.out.println("Web Automation through selenium");
		
	}

	public static void main(String[] args) {
		
		seleniumAutomation course1 = new seleniumAutomation();  //is a relationship (Inheritance)
		course1.apiAutomation();
		sdetCourse course2 = new sdetCourse();  //has a relationship
		course2.webAutomation();
	}
}
