package demo;

public class demo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// java program to swap two numbers using some variable
		
		
		
		float first = 1.50f, second = 2.45f;
		
		System.out.println("--Before Swap--");		
		
		System.out.println("First number = " + first);
		
		System.out.println("Second number =" + second);
		
		// value of first is assigned to temporary variable
		
		float temporary = first;
		
		// value of second is assigned to first
		
		first= second;
		
		// value of temporary is assigned to second.
		
		second = temporary;
		
		
		System.out.println("---After swap---");
		System.out.println("first Number = " + first);
		
		System.out.println("Second Number= "+ second);
		
		
		
	}

}
