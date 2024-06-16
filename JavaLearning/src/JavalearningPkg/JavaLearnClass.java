package JavalearningPkg;

public class JavaLearnClass {
	
int fno = 100;
int sno = 200;
int tno = fno+sno;

public void SumTwoNum()

{
	
System.out.println("Sum of two numbers is " + tno);

}
	
public static void main(String[] args)

{
	JavaLearnClass sum = new JavaLearnClass();
	sum.SumTwoNum();

}


}
