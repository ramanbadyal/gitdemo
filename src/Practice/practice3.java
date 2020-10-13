package Practice;

import java.util.Scanner;


public class practice3 {

	
	
	public practice3() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		int x = 37;
		System.out.println(x);
		
		float y = 34.5f;
		System.out.println(y);
		
		String myname = "Raman";
		System.out.println(myname);
		
		
		String fname = "Ankur";
		String lname = "The great";
		System.out.println("My name is " + fname + " "+ lname);
		
		
		
		float x = 2.3f;
		int y = 23;
		
		
		System.out.println(x * y);
		
		
		String name1 = "How do you like them apples?";
		int a = 35;
		
		System.out.println(name1 + " " + a);
		
		
		
		int x = 3;
		int y = 4;
		if (x>y) {
		System.out.println("How do you like them apples");
		}
		else if (y>x) {
		System.out.println("Tough luck mate");
		}
		else {
			System.out.println("It is what it is");
		
		}
		
		
		int age = 18;
				if (age>19) {
					System.out.println("Come on in mate");
				}
				else {
					System.out.println("Tough luck mate");
				}
		
		
		
		String x = "This and that ";
		System.out.println("The length of this string is :" + x.length());
		
		
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("The first number is :");
		
		int var1 = scan.nextInt();
		
		System.out.println("The second number is:");
		
		int var2 = scan.nextInt();
		
		scan.close();
		
		int var3= (var1*var2);
		
		System.out.println("The final number is: " + var3);
		
		
		
		
		for (int x = 1; (x<5);x= x+1) {
			System.out.println(x);
		}
		
		*/
	
		
		int num = 10;
		long factorial = 1;
		for (int i=1; i<= num; i++) {
			
			factorial  *= i;
			
			
		}
		System.out.printf("Factorial of %d = %d", num,factorial);
				
				
		
	}

}