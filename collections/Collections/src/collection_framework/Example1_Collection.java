package collection_framework;

import java.util.ArrayList;

public class Example1_Collection 
{

	public static void main(String[] args)
	{
		ArrayList<String> obj = new ArrayList<String>();

	   
	      obj.add("Ajeet");                               
	      obj.add("Sameer");
	      obj.add("Chaitanya");
	      obj.add("Sudheer");
	      obj.add("Anuj");

	      
	      System.out.println("Original ArrayList:");
	      for(String str:obj)
	         System.out.println(str);

	     
	      obj.add(0, "Rahul");
	      obj.add(1, "Ram");

	     
	      System.out.println("ArrayList after add operation:");
	      for(String str:obj)
	         System.out.println(str);

	      
	      obj.remove("Chaitanya"); 
	      obj.remove("Sudheer"); 

	      
	      System.out.println("ArrayList after remove operation:");
	      for(String str:obj)
	         System.out.println(str);

	      
	      obj.remove(1); 

	     
	      System.out.println("Final ArrayList:");
	      for(String str:obj)
	         System.out.println(str);
	   }

	}


