package collection_framework;

import java.util.HashSet;

public class HashSetExample
{

	public static void main(String[] args) 
	{
		HashSet h = new HashSet();
		h.add("First");
		h.add("Second");
		h.add("Third");
		h.add("Fourth");
		h.add("First");
		System.out.println(h);
		

	}

}
