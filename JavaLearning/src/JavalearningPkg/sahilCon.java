package JavalearningPkg;
public class sahilCon {
	public sahilCon() {
		this(3,30,300);
		System.out.println("Default constructor");
	}
	public sahilCon(int a) 
	{	
		this(4,40,400,4000);
		System.out.println("One parameter constructor");
	}
	public sahilCon(int b, int c) {
		this(1);
		System.out.println("Two parameter constructor");
	}
	public sahilCon(int d, int e, int f) {
		System.out.println("Three parameter constructor");
	}
	public sahilCon(int k, int l, int m, int n) {
		this();
		System.out.println("Four parameter constructor");
	}
	public static void main(String[] args) {	
		sahilCon cons = new sahilCon(2,20);
	}
}
