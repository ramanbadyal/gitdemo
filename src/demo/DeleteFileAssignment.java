package demo;

import java.io.File;

public class DeleteFileAssignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
File myfile = new File("C:\\filename1.txt");	
		
		if (myfile.delete()) {
			
			System.out.println("File Deleted " + myfile.getName());
			
		}
		
		else
		{
			System.out.println("Failed to delete the file");
		}
		
		
		
		
		
		
		
		
		
		
	}

}
