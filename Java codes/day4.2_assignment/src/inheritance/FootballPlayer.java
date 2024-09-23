package inheritance;

public class FootballPlayer extends Player {

	private int goals;

	public FootballPlayer(String name, int age, String country, int goals) {
		super(name, age, country);
		this.goals = goals;
	}

	public String toString() {
		return super.toString() + "\n Goals scored: " + this.goals;
	}

	public void play() {
		System.out.println(" "+ super.getName() + " Scored " + this.goals + " Goals");
	}
}
