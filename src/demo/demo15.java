package demo;

public class demo15 {

	public demo15() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String sentence = "T         his    is    be   tt er  .";
		System.out.println("original Sentence: " + sentence);
		
		
		sentence = sentence.replaceAll("\\s", "");
		
		//replaceall() method to remove and replace all spaces in the string.
		// -> "\\s" -> stands for whitespace character.
		// "\\s" -> is to find all the space characters -> tabs, spaces and stuff. it will replace that with
		// "" -> empty string
		
		System.out.println("After replacement:" + sentence);
		
		
		
		
		
		
	}

}
