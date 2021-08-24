package Iteration;

public class iteration {
	
	public String [] tensArray = {"Ten","Twenty","Thirty","Forty","Fifty","Sixty","Seventy","Eighty","Ninety"};
	public String [] onesArray = {"One","Two","Three","Four","Five","Six","Seven","Eight","Nine"};
	public String [] hundredArray = {"onehundred","twohundred","threehundred","fourhundred","fivehundred","sixhundred","sevenhundred","eighthundred","ninehundred"};

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		print1to10();
		print100to999();
		printonetoten();
		
		
	}

	public static void print1to10() {
		for(int i = 1; i <= 10; i++) {
            System.out.println(i);
		}
	}

	public static void print100to999() {
		for(int i = 100; i <= 999; i++) {
            System.out.println(i);
		}
	}
	
	public String converToNumber(int input) {
	int hundredCount;
	int tensCount;
	while(input> 100) {
		if ((input-100) > 0) {
			hundredCount++;
			input=input-100;
		}
	}
	while(input > 10) {
		if ((input - 10) > 0) {
			tensCount++;
			input=input-10;
			
		}
	}
	return hundredArray[hundredCount] + " " + tensArray[tensCount] + " " + onesArray[input];
	
}
}
