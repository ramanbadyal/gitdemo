package demo;

import java.io.File;

public class delete_folder {

	public static void main(String[] args) {
		
		File obj = new File("C/\filename");
		
		if (obj.delete()) {
		System.out.println("Folder Deleted" + obj.getName());
		}
		else {
			System.out.println("Deletion Failed");
		}

	}

}
