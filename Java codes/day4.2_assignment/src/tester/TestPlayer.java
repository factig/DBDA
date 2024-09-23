package tester;

import java.util.Scanner;
import inheritance.*;

public class TestPlayer {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//Scanner sc1 = new Scanner(System.in).useDelimiter("\n");
		System.out.println("Enter total number of players to be entered");
		Player players[] = new Player[sc.nextInt()];
		boolean Exit = false;
		int counter = 0;
		while (!Exit) {
			System.out.println(
					"Enter player details as shown:" + "\n1) Add Cricket Player \n" + "2) Add Football player\n"
							+ "3) Add Tennis Player\n" + "4) Display info of all players\n" + "0) Exit");
			System.out.println("Enter Choice");
			System.out.println("----------------------------------------------------");
			switch (sc.nextInt()) {
			case 1:
				System.out.println("Enter Cricket player details as name, age, country, runs scored");
				players[counter] = new CricketPlayer(sc.nextLine(), sc.nextInt(), sc.next(), sc.nextInt());
				counter++;
				System.out.println("----------------------------------------------------");
				break;
			case 2:
				System.out.println("Enter Football player details as name, age, country, goals scored");
				players[counter] = new FootballPlayer(sc.next(), sc.nextInt(), sc.next(), sc.nextInt());
				counter++;
				System.out.println("----------------------------------------------------");
				break;
			case 3:
				System.out.println("Enter Tennis player details as name, age, country, matches won");
				players[counter] = new TennisPlayer(sc.next(), sc.nextInt(), sc.next(), sc.nextInt());
				counter++;
				System.out.println("----------------------------------------------------");
				break;
			case 4:
				System.out.println("\n Details of all players are as follow: ");
				for (Player p1 : players) {
					if (p1 != null)
						System.out.println(p1);

					if (p1 instanceof CricketPlayer)
						((CricketPlayer) p1).play();

					else if (p1 instanceof FootballPlayer)
						((FootballPlayer) p1).play();

					else
						((TennisPlayer) p1).play();
				}
				System.out.println("----------------------------------------------------");
				break;

			case 0:
				Exit = true;
				System.out.println("Program terminated!");
			default:
				System.out.println("Enter Correct choice!");
				break;
			}
		}
		sc.close();
	}

}
