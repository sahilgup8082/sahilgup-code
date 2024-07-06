package JavalearningPkg;

import java.util.Scanner;

public class palindromNumber {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int pno = scan.nextInt();
       int reversedNum = 0;
       int remainder;

    // store the number to originalNum
    int originalNum = pno;
    
    // get the reverse of originalNum
    // store it in variable
    while (pno != 0) {
      remainder = pno % 10;
      reversedNum = reversedNum * 10 + remainder;
      pno /= 10;
    }
    
    // check if reversedNum and originalNum are equal
    
    if (originalNum == reversedNum) {
        System.out.println(originalNum + " is Palindrome.");
      }
      else {
        System.out.println(originalNum + " is not Palindrome.");
      }
    }
  }


