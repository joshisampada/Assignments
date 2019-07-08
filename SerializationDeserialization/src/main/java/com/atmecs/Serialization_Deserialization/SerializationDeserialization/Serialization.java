package com.atmecs.Serialization_Deserialization.SerializationDeserialization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Serialization
{

	
		public static void printdata(Customer object1) 
	    { 
	  
	        System.out.println("name = " + object1.name); 
	        System.out.println("age = " + object1.age); 
	        System.out.println("balance = " + object1.balance); 
	        System.out.println("gender = " + object1.gender); 
	    } 
		
		
		public static void main(String[] args) 
	    { 
			Customer object = new Customer("sam", 23, 1000, 'F'); 
	        String filename = "sam.txt"; 
	        
	        
	  
	        // Serialization 
	        try { 
	  
	            // Saving of object in a file 
	            FileOutputStream file = new FileOutputStream(filename); 
	            ObjectOutputStream out = new ObjectOutputStream(file);  
	                                          
	  
	            // Method for serialization of object 
	            out.writeObject(object); 
	            out.close(); 
	            file.close(); 
	    
	          
	            System.out.println("Object has been serialized\n" + "Data before Deserialization."); 
	                              
	            printdata(object); 
	  
	            // value of static variable changed 
	            object.balance = 2000; 
	        } 
	  
	        catch (IOException ex) { 
	            System.out.println("IOException is caught"); 
	        } 
	  
	        object = null; 
	  
	       // Deserialization 
	        try { 
	  
	            // Reading the object from a file 
	            FileInputStream file = new FileInputStream(filename);  
	                                         
	            ObjectInputStream in = new ObjectInputStream(file);  
	                                        
	  
	            // Method for deserialization of object 
	            object = (Customer)in.readObject(); 
	  
	            in.close(); 
	            file.close(); 
	            System.out.println("Object has been deserialized\n" + "Data after Deserialization."); 
	                                
	            printdata(object); 
	  
	            // System.out.println("z = " + object1.z); 
	        } 
	  
	        catch (IOException ex)
	        { 
	            System.out.println("IOException is caught"); 
	        } 
	  
	        catch (ClassNotFoundException ex) 
	        { 
	            System.out.println("ClassNotFoundException" + 
	                                " is caught"); 
	        }
	  
	}

}
