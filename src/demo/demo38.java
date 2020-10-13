package demo;

import java.io.File;

public class demo38 {

	public static void main(String[] args) {
	
		File obj = new File("filename.txt");	
		
		if (obj.delete()) {
			
			System.out.println("File Deleted " + obj.getName());
			
		}
		
		else
		{
			System.out.println("Failed to delete the file");
		}
		
		
		

	}

}
