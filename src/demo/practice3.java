package demo;

import java.io.File;

import java.io.IOException;

public class practice3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
		File myfile = new File("practicefile4");
		if (myfile.createNewFile()) {
			System.out.println("File created: " + myfile.getName());
		}
		else {
			System.out.println("File name already exist");
		}
		
		
		
		} catch(IOException e) {
			System.out.println("An error has occured");
			e.printStackTrace();
		}
		
		
		
		
		
		
		
		
		
	}
	
	
	

}
