package calculator2;

import java.util.Scanner;

public class Utils {
	
	static Scanner scan = new Scanner(System.in);

	public static int getNextInt() {

		return scan.nextInt();

	}

	public static double getNextDouble() {
		System.out.println("Enter a number");
		return scan.nextDouble();
	}

}
