package SelfPrac;

import JavalearningPkg.HasRelation1;
import JavalearningPkg.HasRelation2;

public class JavaLearnImportClass {
	
	public static void main(String[] args) {
		
		HasRelation1 relate1 = new HasRelation1();
		relate1.RelateMethod1();
		
		System.out.println("package 1 calls from package 2");
		
		HasRelation2 relate2 = new HasRelation2();
		relate2.RelateMethod2();
		
	}

}
