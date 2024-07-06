package JavalearningPkg;

import java.util.Scanner;

public class tablePrint {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int tablepr = scan.nextInt();
        for(int a=1; a<=10; a++)
        
        {
        	int pr = a*tablepr;
        	System.out.println(pr);
        	
        }
		
		
	}

}
