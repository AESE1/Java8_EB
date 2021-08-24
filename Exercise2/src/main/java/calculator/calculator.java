package calculator;

public class calculator {
	
	double n1;
	double n2;
		
	public static void main(String[] args) {
		
		System.out.println(addition(10,5));
		
	}
	
	public static int addition(int n1, int n2) {
		return n1 + n2;
	}
	public static int subtraction(int n1, int n2) {
		return n1 - n2;
	}
	public static int division(int n1, int n2) {
		return n1 / n2;
	}
	public static int multiplication(int n1, int n2) {
	return n1 * n2;
}

}
