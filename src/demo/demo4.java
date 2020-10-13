package demo;

import java.util.Scanner;

public class demo4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Multiply two numbers: user will going to tell us the number
		
		// * this reads the input provided by user.
		// * using keyword
		
		Scanner Scan = new Scanner (System.in);
		System.out.println("Enter your First Number: ");
		
		int num1= Scan.nextInt();
		
		System.out.println("Enter your Second Number: ");
		
		int num2 = Scan.nextInt();
		
		Scan.close();
		
		int product = num1*num2;
		
		System.out.println("Grand Total: " + product);
		

		
		
		
		
		
		
	}

}
