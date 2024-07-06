package JavalearningPkg;

public class runPolymor extends compilePolymor{
	int area;
	public void areaCal(int a,int b)
	{
		System.out.println("Calculate rectangle");
		area = a*b;
	}
	public static void main(String[] args) {
		runPolymor ar3 = new runPolymor();
		ar3.areaCal(10, 20);
		System.out.println("Rectangle: " + ar3.area);
	}
}
