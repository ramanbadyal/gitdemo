package Mentoring1;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class mentoring2 {

	public static void main(String[] args) throws IOException {
		
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Write your first number here");
		
		int var1 = scan.nextInt();
		
		System.out.println("Write your second number here");
		
		int var2 = scan.nextInt();
		
		scan.close();
		
		int var3 = (var1*var2);
		
		System.out.println(var3);
		
		
		
	}

}
