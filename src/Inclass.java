
import java.util.*;

public class Inclass {
	Scanner sc = new Scanner(System.in);

	void Grade() {
		String[] subjects = { "Math", "Science", "English" };
		ArrayList<Integer> marks = new ArrayList<Integer>();

		int mark = 0;
		int avarage = 0;
		String result = null;

		for (int i = 0; i < subjects.length; i++) {
			System.out.print("Enter " + subjects[i] + " marks:");
			mark = sc.nextInt();
			marks.add(mark);
			avarage += mark;
		}
		avarage = avarage / subjects.length;
		if (marks.get(0) < 30 || marks.get(1) < 30 || marks.get(2) < 30) {
			result = "Your result is F";
		} else {
			if (avarage > 90) {
				result = "Your result is A";
			} else if (avarage > 70 && avarage < 89) {
				result = "Your result is B";

			} else if (avarage > 50 && avarage < 69) {
				result = "Your result is C";

			} else if (avarage < 50) {
				result = "Your result is F";

			} else {
				result = "some thing went wrong";
			}
		}

		System.out.println(result);
	}

	void datesInMonth() {
		System.out.println("Enter Month: ");
		int month = sc.nextInt();
		int dateCount = 0;
		String[] months = { "January", "February", "March", "April", "May", "June", "July", "August", "September",
				"October", "November", "December" };

		switch (month) {
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			dateCount = 31;
			break;
		case 4:
		case 6:
		case 9:
		case 11:
			dateCount = 30;
			break;
		case 2:
			dateCount = 28;
			break;
		}

		System.out.println("There are " + dateCount + " Days in " + months[month - 1]);

	}

	void add() {
		int sum = 0;
		int input = 1;

		while (true) {
			System.out.print("Enter your number : ");
			input = sc.nextInt();
			if (input < 0) {
				break;
			}
			sum += input;

		}
		System.out.println("The Sum is " + sum);

	}

	void vending() {
		int input = choise();
		int sum = 0;
		while (input != 0) {
			if (input == 1) {
				sum += 10;
				System.out.println("\nYour Total is " + sum + "\n");
				input = choise();

			} else if (input == 2) {
				sum += 20;
				System.out.println("\nYour Total is " + sum + "\n");
				input = choise();

			} else if (input == 3) {
				sum += 30;
				System.out.println("\nYour Total is " + sum + "\n");
				input = choise();
			} else if (input == 0) {
				break;
			} else {
				System.out.println("Wrong Option");
				input = choise();
			}
		}
		System.out.println("Thanks For Perchesing");
		System.out.println("Your Total is " + sum + "\n");
		System.out.println(sum);

	}

	int choise() {
		System.out.print("Select option\n item01 - 1 \n item02 - 2 \n item03 - 3 \n exit - 0 \n Option :");
		int input = sc.nextInt();
		return input;
	}

	void shopping() {
		System.out.println("Enter code: ");
		String input = sc.nextLine();
		String[] itemCode = { "A132-100", "B134-200" };
		String result = "";
		for (int i = 0; i < itemCode.length; i++) {
			String[] split = itemCode[i].split("-");
			if (input.equalsIgnoreCase(split[0])) {
				result = "The Price is : " + split[1];
			}
		}
		if(!result.isBlank()) {
			System.out.println(result);
		}else {
			System.out.println("Enter a valid Code");
		}
	}
}
