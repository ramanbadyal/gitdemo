package demo;

import java.util.HashMap;

public class HashmapStoreItem {

	public static void main(String[] args) {
		
		// A Hashmap store item in key/value pairs and you can access items by index or another type
		
		
		//Create an HashMap Object
		
		HashMap<String,String> CapitalCities = new HashMap<String,String>();
		
		// Add keys and values (Country,City)
		
		CapitalCities.put("Ottawa", "Canada");
		CapitalCities.put("Washington DC", "USA");
		CapitalCities.put("Beijing", "China");
		CapitalCities.put("Tokyo", "Japan");
		
		
		System.out.println(CapitalCities.get("Tokyo")); 
		System.out.println(CapitalCities);
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
