package calculator2;

public class menu {
	static calculator calculator = new calculator();
	static int operatorChoice = 1;

	public static int getChoice() {

		System.out.println("Please choose your preferred Operator:");
		System.out.println("1. Addition");
		System.out.println("2. Subtraction");
		System.out.println("3. Multiplication");
		System.out.println("4. Division");
		System.out.println("0. Quit");

		return Utils.getNextInt();
	}

	public static void actions() {
		while (operatorChoice != 0) {
			operatorChoice = getChoice();

			switch (operatorChoice) {
			case 1:
				System.out.println(
						"The answer is: " + calculator.addition(Utils.getNextDouble(), Utils.getNextDouble()));
				break;
			case 2:
				System.out.println("The answer is: "
						+ calculator.subtraction(Utils.getNextDouble(), Utils.getNextDouble()));
				break;
			case 3:
				System.out.println("The answer is: "
						+ calculator.multiplication(Utils.getNextDouble(), Utils.getNextDouble()));
				break;
			case 4:
				System.out.println(
						"The answer is: " + calculator.division(Utils.getNextDouble(), Utils.getNextDouble()));
				break;
			default:
				System.out.println("Error, please try again.");
				break;
			case 0:
				System.out.println("Quitting");
				Utils.scan.close();
				break;
			}

		}

	}

}
