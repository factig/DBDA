package inheritance;

public class Player {
	private String name;
	private int age;
	private String country;

	public Player(String name, int age, String country) {
		this.name = name;
		this.age = age;
		this.country = country;
	}

	public String toString() {
		return "\n Name of player :" + this.name + "\n Age of player: " + this.age + "\n Country of player: "
				+ this.country;
	}
	
	public void play()
	{
		System.out.println("Playing a sport !");
	}

	public String getName() {
		return name;
	}

	
	
	
}
