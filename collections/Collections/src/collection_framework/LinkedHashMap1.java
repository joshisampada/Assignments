package collection_framework;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMap1
{

	public static void main(String[] args)
	{
		// Defining object of LinkedHashMap Class
        HashMap<Integer,String> LinkedHashMap=new LinkedHashMap<Integer,String>();
		
		// Adding Key Value pair
        LinkedHashMap.put(1001,"India");
        LinkedHashMap.put(1002,"Canada");
        LinkedHashMap.put(1003,"Australia");

		// Displaying key value pairs using for loop
        for(Map.Entry map  :  LinkedHashMap.entrySet() )
          {
        	// Using getKey and getValue methods to retrieve key and corresponding value
        	System.out.println(map.getKey()+" "+map.getValue());
          }
		
		// Adding element with duplicate key
        LinkedHashMap.put(1003,"Nepal");

		 // Displaying Elemnets
        System.out.println("Entries after adding element with Duplicate Key");
        for(Map.Entry map  :  LinkedHashMap.entrySet() )
           {
        	System.out.println(map.getKey()+" "+map.getValue());
           }
		
		// Adding element with duplicate value
        LinkedHashMap.put(1004,"India");

		// Displaying Elemnets
        System.out.println("Entries after adding element with Duplicate Value");
        for(Map.Entry map  :  LinkedHashMap.entrySet() )
           {
        	System.out.println(map.getKey()+" "+map.getValue());
           }
		
		// create a Linkedhashmap
        LinkedHashMap hashmapobj = new LinkedHashMap();
		
		// using Object put(Object key, Object value) method
        hashmapobj.put(1001, "India");
        hashmapobj.put(1002, "Canada");
        hashmapobj.put(1003, "Australia");
		hashmapobj.put(1004, "India"); 
		System.out.println(" All the key value pairs " + hashmapobj);  
		System.out.println(" Size of hashmap is " + hashmapobj.size());
		
		//using clear() method
		hashmapobj.clear();

		//using size() method  after clearing the linkedhashmap
        System.out.println(" Size of hashmap after clearing is " + hashmapobj.size());

	}

}
