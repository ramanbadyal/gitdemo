package demo;

import java.util.LinkedList;

public class JavaLinkedList {

	public static void main(String[] args) {
		
		//linked list
		
		
		LinkedList<String> cars = new LinkedList<String>();
		
		cars.add("Ferrari");
		cars.add("Mclaren");
		cars.add("Mercedes");
		cars.add("Pagani");
		
		
		cars.addFirst("Tesla");
		cars.addLast("Audi");
		cars.removeFirst();
		
		
		System.out.println(cars);
		
		System.out.println(cars.getFirst());
		
		
		
		
		

	}

}
