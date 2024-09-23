package inheritance;

public class TennisPlayer extends Player {

	private int matches;

	public TennisPlayer(String name, int age, String country, int matches) {
		super(name, age, country);
		this.matches = matches;
	}

	public String toString() {
		return super.toString() + "\n matches won: " + this.matches;
	}

	public void play() {
		System.out.println(" "+ super.getName() + " won " + this.matches + " matches");
	}
}
