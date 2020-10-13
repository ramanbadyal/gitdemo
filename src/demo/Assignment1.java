package demo;

import java.io.File;
import java.io.IOException;


public class Assignment1 {

	public static void main(String[] args) {
		
		// create a file
		//create a file in C drive
		// delete any file

		try {
		
		File myfile = new File("C:\\Filename1.txt");
		if (myfile.createNewFile()) {
			
			System.out.println(myfile.getName());
			
		}
		
		else {
			System.out.println("File Already Exists");
		}
		
		}
		
		catch(IOException exclude) {
			System.out.println("An Error occured");
			exclude.printStackTrace();
		}
		
		
		
	}

}
