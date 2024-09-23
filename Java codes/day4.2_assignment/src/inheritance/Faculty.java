package inheritance;

//Faculty -- firstName,lastName,years of experience , sme(subject matter expertise)
public class Faculty extends Person {
	private int expInYears;
	private String sme;

	public Faculty(String firstName, String lastName, int expInYears, String sme) {
		super(firstName, lastName);
		System.out.println("in faculty ctor");
		this.expInYears = expInYears;
		this.sme = sme;
	}

	// override method to return COMPLETE details of the faculty
	@Override
	public String toString() {
		return "Faculty - " + super.toString() + " exp in years " + expInYears + " SME " + sme;
	}

	public void teach() {
		System.out.println(getLastName() + "is teaching in" + this.sme);
	}

}
