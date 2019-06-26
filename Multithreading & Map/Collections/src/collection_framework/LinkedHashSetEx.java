package collection_framework;

import java.util.*;
public class LinkedHashSetEx 
{

	public static void main(String[] args) 
	{
		LinkedHashSet h = new LinkedHashSet();
		h.add("First");
		h.add("Second");
		h.add("Third");
		h.add("Fourth");
		h.add("First");
		System.out.println(h);

	}

}
