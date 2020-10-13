package demo;

import java.io.File;
import java.io.IOException;

public class demo36 {

	public static void main(String[] args) {
		
		
		// Java File Handling :

		//import java.io.File;
		
		//file obj = new file ("filename.txt");
		
		// Create a file:
		
		try { 
			
		File myobj = new File("filename.txt");
		if (myobj.createNewFile())
			
		{
			System.out.println("File created: " + myobj.getName());
		}
			
		else
		{
			System.out.println("File already exists");
		}
			
			
		}
		catch(IOException e) {
			System.out.println("An Error Occured");
			e.printStackTrace();
		}
		
	
		
		
		
		
		
	}

}
