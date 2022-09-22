package javaCampHomeworks2022;

public class hw210MultiDimensionalArrayDemo {

	public static void main(String[] args) {
		// String cities ---> one string
		// String[] --------> single line array
		// String[][] ------> + column
		String[][] cities = new String[3][3];

		cities[0][0] = "Tokyo";
		cities[0][1] = "Shangai";
		cities[0][2] = "Seoul";
		cities[1][0] = "Istanbul";
		cities[1][1] = "Tehran";
		cities[1][2] = "Moscow";
		cities[2][0] = "Washington";
		cities[2][1] = "Ottowa";
		cities[2][2] = "Bogotá";

		// nested loop
		for (int i = 0; i <= 2; i++) {
			System.out.println("------------------------");
			for (int j = 0; j <= 2; j++) {
				System.out.println(cities[i][j]);
			}

		}
	}

}
