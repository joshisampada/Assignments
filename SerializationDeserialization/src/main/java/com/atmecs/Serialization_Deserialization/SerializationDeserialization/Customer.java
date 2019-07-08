package com.atmecs.Serialization_Deserialization.SerializationDeserialization;

import java.io.Serializable;

public class Customer implements Serializable
{

	private static final long serialversionUID = 129348938L; 
	transient int age; 
	static int balance; 
	String name=null; 
	Character gender; 
	    
	  
	    // Default constructor 
	public Customer(String name, int age, int a, int b) 
	    { 
	        this.name = name; 
	        this.age = age; 
	        this.balance = balance; 
	        this.gender = gender; 
	    } 
	  
	
	
	  
	  } 
	