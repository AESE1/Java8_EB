package collections;

import java.util.ArrayList;
import java.util.List;

public class collections {
	
	public static List<Integer> numbers = new ArrayList<Integer>();
	public static List<Integer> numbersArray = new ArrayList<Integer>();

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		addToArray();
		addToArrayList();
		multiplyList();
		
		System.out.println(numbers);
		System.out.println(numbersArray);
//		System.out.println(numbersArray);
		
	}
	 

	public static void addToArrayList() {
		for(int i = 1; i <= 100; i++) {
      numbers.add(i);
		}
	}
	
	public static void addToArray() {
		for(int i = 100; i <= 999; i++) {
      numbersArray.add(i);
		}
		}

	
	public static void multiplyList() {
		for(int i : numbers) {
			i = i * 10;
			System.out.println(i);
						
		}
		
 
      
		}
}
	

