package inheritance;

public class CricketPlayer extends Player {

	private int runs;

	public CricketPlayer(String name, int age, String country, int runs) {
		super(name, age, country);
		this.runs = runs;
	}

	public String toString() {
		return super.toString() + "\n Runs scored: " + this.runs;
	}

	public void play() {
		System.out.println(" "+super.getName() + " Scored " + this.runs + " runs");
	}
}
