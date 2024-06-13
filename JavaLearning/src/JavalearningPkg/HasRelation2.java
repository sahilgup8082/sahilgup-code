package JavalearningPkg;

public class HasRelation2 {
	
	public void RelateMethod2()
	
	{
		System.out.println("Object create from HasRelation1 class method");
		
	}
	
	public static void main(String[] args) {
		
		HasRelation1 relate1 = new HasRelation1();
		relate1.RelateMethod1();
		
		HasRelation1 relate2 = new HasRelation1();
		relate2.RelateMethod1();
		
		HasRelation2 relate = new HasRelation2();
		relate.RelateMethod2();
				
	}

}
