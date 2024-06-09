package JavalearningPkg;
public class MultiExpressionOne {
	public int Sum(int a, int b)
	{
		int c;
		c = a+b;
		System.out.println("Result of sum = " + c );		
		return c;
	}	
	public int Sub(int x, int y) 	
	{
		int z;
		z= x-y;
		System.out.println("Result of subs = " + z);
		return z;	
	}
	public int Multi(int p, int q) 
	{
		int r;
		r= p*q;
		System.out.println("Result of multiply = " + r);
		return r;	
	}
	public void Div(int m, int n) 
	{
		int p;
		p= m/n;
		System.out.println("Result of divide = " + p);	
	}
	public static void main(String[] args)
	{	
		MultiExpressionOne result = new MultiExpressionOne();
		int sum1 = result.Sum(10,2);
		int sum2 = result.Sum(sum1,2);
		int subop = result.Sub(sum2,2);
		int multiop = result.Multi(subop,2);
		result.Div(multiop,2);		
	}
	
}
