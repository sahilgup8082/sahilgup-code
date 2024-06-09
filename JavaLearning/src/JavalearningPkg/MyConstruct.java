package JavalearningPkg;

public class MyConstruct {
	
	public MyConstruct() {
		
		System.out.println("Default Constructor");
		
	}
	public MyConstruct(int a) {
		
		System.out.println("one parameter Constructor");
		
	}

public MyConstruct(int x, int y) {
	
	System.out.println("two parameter Constructor");
	
}

 public static void main(String[] args) {
	
	 MyConstruct obj1 = new MyConstruct();
	 MyConstruct obj2 = new MyConstruct(100);
	 MyConstruct obj3 = new MyConstruct(100,200);
}
}
