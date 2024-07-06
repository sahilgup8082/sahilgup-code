package JavalearningPkg;

public class compilePolymor {
	int area;
	public void areaCal(int a)
	{
		System.out.println("Calculate Square");
		area=a*a;
	}
	public void areaCal(int a,int b)
	{
		System.out.println("Calculate rectangle");
		area = a*b;
	}
	
	public void areaCal(int a,int b,int c)
	{
		System.out.println("Calculate Surface");
		area = a*b*c;		
	}
	
	public static void main(String[] args) {
		
		System.out.println("Calculate the area:");
		compilePolymor ar = new compilePolymor();
		ar.areaCal(10);
		System.out.println(ar.area);
		compilePolymor ar1 = new compilePolymor();
		ar1.areaCal(10, 20);
		System.out.println(ar1.area);
		compilePolymor ar2 = new compilePolymor();
		ar2.areaCal(10, 20, 30);
		System.out.println(ar2.area);
		
	}
}
