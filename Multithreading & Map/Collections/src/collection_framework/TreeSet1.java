package collection_framework;

import java.util.TreeSet;

public class TreeSet1
{

	public static void main(String[] args)
	{
		TreeSet <Integer>treeSetObject1 = new TreeSet<Integer>();

		  TreeSet <Integer>treeSetObject2 = new TreeSet<Integer>();

		  treeSetObject1.add(3);

		  treeSetObject1.add(5);

		  treeSetObject1.add(5);

		  treeSetObject1.add(1);

		  treeSetObject1.add(2);

		  treeSetObject2.add(9);

		  treeSetObject2.add(11);

		  treeSetObject2.add(1);

		  treeSetObject2.add(8);

		  treeSetObject2.add(7);

		  treeSetObject1.addAll(treeSetObject2);

		  System.out.println("Values in TreeSet object 1: " +treeSetObject1);
		  
		  System.out.println("Ceiling value of '7' is:" +treeSetObject1.ceiling(7));

		  System.out.println("Ceiling value of '10' is:" +treeSetObject1.ceiling(3));
		  
		  treeSetObject1.clear();

		  System.out.println("Values in TreeSet object 1:" +treeSetObject1);


		  }

	}

