package inheritance;
/*
 * Person-Student-Faculty scenario.
Can you apply inheritance to it ?
Person -- firstName,lastName
Student --firstName,lastName,graduation year,course,fees,marks
Faculty -- firstName,lastName,years of experience , sme(subject matter expertise)

 */
public class Person {
	//tight encapsulation
	private String firstName;
	private String lastName;
	public Person(String firstName, String lastName) {
		super();
		System.out.println("in person's ctor");		
		this.firstName = firstName;
		this.lastName = lastName;
	}	
	//override the inherited method ,  to return Person's details
	@Override
	public String toString() {
		return this.firstName+" "+this.lastName;
	}
	
	public String getFirstName()
	{
		return this.firstName;
	}
	
	public String getLastName()
	{
		return this.lastName;
	}

}
