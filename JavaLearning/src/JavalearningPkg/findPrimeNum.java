package JavalearningPkg;

import java.util.Scanner;

public class findPrimeNum {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int pno = scan.nextInt();
	    boolean check = false;
	    for (int i = 2; i <= pno / 2; ++i) 
	    {
	      if (pno % i == 0)  // condition for nonprime number
	      {    
	        check = true;
	        break;
	      }
	    }

	    if (!check)
	      System.out.println(pno + " is a prime number.");
	    else
	      System.out.println(pno + " is not a prime number.");
		
		
	}

}
