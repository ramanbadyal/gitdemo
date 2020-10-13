package demo;

public class java_Exceptions {

	public static void main(String[] args) {
	
		
	//Java Exceptions
		try {
		int[] mynumbers = {1,2,3};
		
		System.out.println(mynumbers[10]);
		
		
		}
		catch (Exception e)
		{
			System.out.println("Something went wrong");
		}

	}

}
