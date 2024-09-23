package tester;

import java.util.Scanner;
import inheritance.*;

public class EventOrganizer {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number of participants in the event expected");
		Person[] participants = new Person[sc.nextInt()];

		boolean exit = false;
		int counter = 0;
		while (!exit) {
			System.out.println(
					"Enter your choice from below:\n" + "1.0 Student Registration \n" + "2.0 Faculty Regostration \n"
							+ "3.0 Display all participants \n" + "4.0 Display specific participant\n" + 
							"5.0 Display participant specific \n"+"0 Exit");
			switch (sc.nextInt()) {
			case 1:
				System.out.println(
						"Enter student details as first name, last name, graduation year, course name, fees , marks");
				participants[counter] = new Student(sc.next(), sc.next(), sc.nextInt(), sc.next(), sc.nextInt(),
						sc.nextDouble());
				counter++;
				System.out.println("Student registered successfully");
				System.out.println("-------------------------------------");
				break;

			case 2:
				System.out.println("Enter Faculty details as first name, last name, experience in years, sme");
				participants[counter] = new Faculty(sc.next(), sc.next(), sc.nextInt(), sc.next());
				counter++;
				System.out.println("Faculty registered successfully");
				System.out.println("-------------------------------------");
				break;
			case 3:
				System.out.println("Below are the participants in the event: ");
				for (Person p : participants) {
					if (p != null)
						System.out.println(p);
				}
				System.out.println("-------------------------------------");
				break;
			case 4:
				System.out.println("Enter Seat no of participant");
				int index = sc.nextInt() - 1;
				if (index >= 0 && participants[index] != null)
					System.out.println(participants[index]);
				System.out.println("-------------------------------------");
				break;
				
			case 0:
				exit = true;
				System.out.println("Program terminated!!");
				break;

			case 5:
				System.out.println("Enter Seat no of participant");
				index = sc.nextInt() - 1;
				if (index >= 0 && participants[index] != null)
					{Person p = participants[index];
						if (p instanceof Student)
							((Student)p).study();
						else
							((Faculty)p).teach();
					}
				break;

			default:
				System.out.println("Enter Correct choice");
				System.out.println("-------------------------------------");
				break;
			}
		}
		
		sc.close();

	}

}
