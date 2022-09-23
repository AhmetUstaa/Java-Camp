package methods2;

public class Main {

	public static void main(String[] args) {
		String message = "Today is a good day to love.";
		String newMessage = giveTheCity();
		System.out.println(newMessage);
		int number = sum(1, 3);
		System.out.println(number);
		int sum = sum2(2, 3, 4);
		System.out.println(sum);
	}

	public static void add() {
		System.out.println("Added");
	}

	public static void delete() {
		System.out.println("Deleted");
	}

	public static void update() {
		System.out.println("Updated");
	}

	// This means that this function returns a value of type int.
	public static int sum(int number1, int number2) {
		return number1 + number2;
	}

	// ... means variables argument. The numbers variable an integer array.
	// Variable argument reduces the testability of the code, so collections can be
	// used.
	public static int sum2(int... numbers) {
		int sum = 0;
		for (int number : numbers) {
			sum += number;
		}

		return sum;

	}

	public static String giveTheCity() {
		return "Passau";
	}

}
