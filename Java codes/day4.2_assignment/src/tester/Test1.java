package tester;

import inheritance.*;

public class Test1 {

	public static void main(String[] args) {
		//create student 
		/*
		 * String firstName, String ln, int year, 
			String course, int fees, double marks
		 */
		//InDirect referencing - type of the reference  : Person
		//type of instance : Student
		
		Person p1;//p : Person type of reference
		p1=new Student("a1", "b1",2021,"Java" ,12345, 80);//up casting
		//create faculty
		/*
		 * String firstName, String lastName,
			int expInYears, String sme
		 */
	
		System.out.println(p1);//p1.toString() : run time polymorphism
		/*
		 * Important statement - JVM resolves the method binding by the 
		 * type of the instance(object) - late binding
		 */
		//InDirect referencing
		Person p2=new Faculty("a2", "b2", 10, "Java React ML");//up casting
		
		System.out.println(p2);//p2.toString() : run time polymorphism
	}
	
		
	

}
