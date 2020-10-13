package demo;

import java.io.File;
import java.io.IOException;


public class demo37 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			
			File obj = new File("C:\\filename");
			if (obj.createNewFile()) {
				System.out.println("File created: " + obj.getName());
				System.out.println("Absolut path: " + obj.getAbsolutePath());
				
			}
			
			else {
				System.out.println("File already exists");
				
			}
		}
		
		catch (IOException e) {
			System.out.println("An Error occured");
			e.printStackTrace();
			
		}
		
		
		
		
		
		
		
		
		
		
	}

}
