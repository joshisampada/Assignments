package collection_framework;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class TreeMap1 
{

	public static void main(String[] args)
	{
		// Defining object of treeMap Class
		TreeMap<Integer,String> treeMap=new TreeMap<Integer,String>();
		
		// Adding Key Value pair
		treeMap.put(1001,"India");
		treeMap.put(1002,"Canada");
		treeMap.put(1003,"Australia");

		// Displaying key value pairs using for loop
        for(Map.Entry map  :  treeMap.entrySet() )
          {
        	// Using getKey and getValue methods to retrieve key and corresponding value
        	System.out.println(map.getKey()+" "+map.getValue());
          }
		
		// Adding element with duplicate key
        treeMap.put(1003,"Nepal");

		 // Displaying Elemnets
        System.out.println("Entries after adding element with Duplicate Key");
        for(Map.Entry map  :  treeMap.entrySet() )
           {
        	System.out.println(map.getKey()+" "+map.getValue());
           }
		
		// Adding element with duplicate value
        treeMap.put(1004,"India");

		// Displaying Elemnets
        System.out.println("Entries after adding element with Duplicate Value");
        for(Map.Entry map  :  treeMap.entrySet() )
           {
        	System.out.println(map.getKey()+" "+map.getValue());
           }
		
		System.out.println("Ceiling entry for 99: "+ treeMap.ceilingEntry(99));
		System.out.println("Ceiling entry for 103: "+ treeMap.ceilingEntry(1003));
		
		TreeMap<Integer,String> treeMap1=new TreeMap<Integer,String>();
        //using clone method
        treeMap1 =(TreeMap) treeMap.clone();
        System.out.println("Before using Clone method: "+ treeMap);
        System.out.println("After using Clone method: "+ treeMap1);
		
		//using clear() method
		System.out.println("TreeMap before : " + treeMap);
		treeMap.clear();
		System.out.println("TreeMap After clear method: " + treeMap);
		
		 

		//using size() method  after clearing the hashmap
        System.out.println(" Size of hashmap after clearing is " + treeMap.size());
        
       

	}

}
