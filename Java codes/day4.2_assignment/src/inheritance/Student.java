package inheritance;

/*
 * Student --firstName,lastName,graduation year,course,fees,marks
 */
public class Student extends Person {
	// additional state
	private int gradYear;
	private String courseName;
	private int fees;
	private double marks;

	public Student(String firstName, String ln, int year, 
			String course, int fees, double marks) {
		super(firstName,ln);
		System.out.println("in student's ctor");
		this.gradYear=year;
		this.courseName=course;
		this.fees=fees;
		this.marks=marks;
	}
	//overriding form of the super class method
	//Rule - same method name , same signature(method args) ,
	//same ret type
	//access specifier can be same or wider
	@Override
	/*
	 * @Override - compile time , method level annotation
	 * annotation => information for javac
	 * optional BUT recommended !
	 * Meaning - To tell javac , following is the the overriding 
	 * form of the method
	 */
	public String toString() {
		return "Student -"+super.toString()+" "+gradYear+" "+courseName
				+" "+fees+" "+marks;
	}
	
	public void study()
	{
		System.out.println(getFirstName()+"is studying in"+this.courseName);
	}

}
