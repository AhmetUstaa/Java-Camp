package javaCampHomeworks2022;

public class hw26SwitchDemo {

	public static void main(String[] args) {
		char grade = 'B';

		switch (grade) {

		case 'A':
			System.out.println("Congratulations! : You Passed!");
			break;
		case 'B':
			System.out.println("Great : You Passed..");
			break;
		case 'C':
			System.out.println("Good : You Passed..");
			break;
//If you want to show same output to different criteria 
//that the code will work.
		// case 'B':
		// case 'C':
		case 'D':
			System.out.println("You make it : You Passed..");
			break;
		case 'F':
			System.out.println("Failed..............");
			break;
		default:
			System.out.println("Invalid Entry");

		}
	}

}
