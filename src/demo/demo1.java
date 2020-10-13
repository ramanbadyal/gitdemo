package demo;

import java.util.Scanner;

public class demo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//how to print an integer entered by an user.
		
		
		//Create a reader instance which takes input from standard input
		
		
		Scanner reader = new Scanner(System.in);
				
				
		// An object of Scanner class, reader is created to take input from standard input
	
		
		System.out.println("Enter a number: ");
		
		
		//nextInt() reads the next integer from keyboard
		
		
		int number = reader.nextInt();
		
	
		// printin() prints the following line to the output screen
		
		System.out.println("You Entered:" + number);
		
	}

}
