package checkString;

public class checkString {
	
static String name = "Anton";

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		checkName(name);
	}

	public static void checkName(String name) {
		if(name == "Anton") {
			System.out.println("The name matches");
		}
		else {
			System.out.println("The name does not match");
		}
	}
}
