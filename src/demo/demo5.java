package demo;

import java.util.Scanner;


public class demo5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner Scan = new Scanner (System.in);
		

		System.out.println("Enter your First Number: ");
		
		float num1= Scan.nextFloat();
		
		System.out.println("Enter your Second Number: ");
		
		float num2= Scan.nextFloat();
		
		Scan.close();
		
		float product = num1*num2;
		
		System.out.println("Grand Total: " + product);
	}

}
