package javaCampHomeworks2022;

public class hw29RecapDemo2 {

	public static void main(String[] args) {
		// double[] myList = new double[4];
		double[] myList = { 1.2, 1.3, 4.3, 5.6 };
		double total = 0;
		double max = myList[0];
		for (double number : myList) {
			if (max < number) {
				max = number;
			}
			total = total + number;
			System.out.println(number);
		}

		System.out.println("Total = :" + total);
		System.out.println("theBiggest = :" + max);
	}

}
