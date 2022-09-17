package conditionals;

public class Main {

	public static void main(String[] args) {

		int number = 24;
		if (number < 20) {
			System.out.println("The number is less than 20.");
			// Should be == when you want to control about equal condition.
			// An equals symbol is to assign a value.
		} else if (number == 20) {
			System.out.println("The number is equal to 20.");
			// As a best practice, it is necessary to prevent data leaks by closing
			// condition blocks with else.
			// This is called Defensive Programming.
		} else {
			System.out.println("The number is greater than 20.");
		}

	}

}
