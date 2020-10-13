package demo;

import java.util.Scanner;

public class pratice4 {

	public static void main(String[] args) {
		

		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter your credit card name here:");
		
		String myname = scan.nextLine();
		
		System.out.println("Enter your credit card number here: ");
		
		long mynumber = scan.nextLong();
		
		System.out.println("Enter the CVS number here :");
		
		int mycvs = scan.nextInt();
		
		scan.close();
		
		System.out.println("Credit card name is: " + myname );
		System.out.println("Credit card number is here:" + mynumber);
		System.out.println("Credit card cvs is:" + mycvs);
		
	}

}
