package JavalearningPkg;

public class swapNumWithout {
	
	public static void main(String[] args) {
		
		int fno = 12;
		int sno = 20;
		
	    fno = fno+sno;
	    sno=fno-sno;
	    fno=fno-sno;
	    System.out.println("First no is: " + fno);
	    System.out.println("Second no is: " + sno);
	}
}
