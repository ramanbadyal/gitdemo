package demo;

import java.util.Scanner;


public class FillingForms {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// User Input Program - for sign up or filling up the form.
		
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter your Credit card details");
		
		String CreditInfo = scan.nextLine();
		
		System.out.println("Enter your credit card number here");
		int CreditCardNumber = scan.nextInt();
		
		System.out.println("Enter your cvc number here"); 
		
		int CreditCardCVC = scan.nextInt();
		
		
		
		System.out.println("Name :" + CreditInfo);
		System.out.println("Credit Card number: " + CreditCardNumber );
		System.out.println("CVC number: " + CreditCardCVC);
		
		
		
		
		
		
	}

}
