package javaCampHomeworks2022;

public class hw216FindTheNumber {

	public static void main(String[] args) {
		int[] numbers = new int[] { 1, 2, 5, 7, 9, 0 };
		int findThisNumber = 5;
		boolean anyHave = false;

		for (int number : numbers) {
			if (number == findThisNumber) {
				anyHave = true;
				break;
			}
		}
		if (anyhave) {
			System.out.println("I am hereeeee!!!!");
		} else {
			System.out.println("Nope, try again loooooser :)");
		}
	}

}
