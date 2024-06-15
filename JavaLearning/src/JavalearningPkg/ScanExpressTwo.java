package JavalearningPkg;

import java.util.Scanner;

public class ScanExpressTwo {

	public int Sum(int x1, int x2)
	{
		
		int plus = x1+x2;
		System.out.println("Rsult of sum="+plus);
		return plus;
		
	}
	public int Subtract(int x3, int x4)
	
	{
		int sub = x3-x4;
		System.out.println("Rsult of substract="+sub);
		return sub;
	}
	public int Multiply(int x5, int x6)
	
	{
		int multi = x6*x5;
		System.out.println("Rsult of multiply="+multi);
		return multi;
	}
	public void Division(int x7, int x8)
	
	{
		int div = x7/x8;
		System.out.println("Rsult of division="+div);
	}
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the value of x1:");
		int op1 = scan.nextInt();
		
		System.out.println("Enter the value of x2:");
		int op2 = scan.nextInt();
		
		System.out.println("Enter the value of x3:");
		int op3 = scan.nextInt();
		
		System.out.println("Enter the value of x4:");
		int op4 = scan.nextInt();
		
		System.out.println("Enter the value of x5:");
		int op5 = scan.nextInt();
		
		System.out.println("Enter the value of x6:");
		int op6 = scan.nextInt();
		
		ScanExpressOne exp = new ScanExpressOne();
		int mult1 = exp.Multiply(op1, op2);
		int sum1 = exp.Sum(mult1, op3);
		int sub1 = exp.Subtract(sum1, op4);
		int sub2 = exp.Subtract(sub1, op5);
		exp.Division(sub2, op6);
		
		
	}

}