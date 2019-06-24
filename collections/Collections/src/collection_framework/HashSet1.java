package collection_framework;


import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSet1 
{

	public static void main(String[] args) 
	{
		HashSet<String> daysOfWeek = new HashSet<>();

        // Adding new elements to the HashSet
        daysOfWeek.add("Monday");
        daysOfWeek.add("Tuesday");
        daysOfWeek.add("Wednesday");
        daysOfWeek.add("Thursday");
        daysOfWeek.add("Friday");
        daysOfWeek.add("Saturday");
        daysOfWeek.add("Sunday");
        
     // Find the size of a HashSet
        System.out.println("Number of days in the HashSet " + daysOfWeek.size());

        // Adding duplicate elements will be ignored
        daysOfWeek.add("Monday");
        
     // Check if the HashSet contains an element
        String days = "Wednesday";
        if(daysOfWeek.contains(days)) 
        {
            System.out.println(days + " is in the Week of days set.");
        }
        else 
        {
            System.out.println(days + " is not in the Week of days set.");
            System.out.println(daysOfWeek);
        }
        
        System.out.println("=== Iterate over a HashSet using iterator() ===");
        Iterator<String> daysOfWeekIterator = daysOfWeek.iterator();
        while (daysOfWeekIterator.hasNext()) {
            String daysOfWeek1 = daysOfWeekIterator.next();
            System.out.println(daysOfWeek);
        }
        
        if(daysOfWeek.contains("I")){

        	System.out.println("Hash Set Contains 'I'");

        	}

        	else{

        	System.out.println("Hash Set Do not Contains 'I'");

        	}
        
        daysOfWeek.remove("Wednesday");

        System.out.println("hash set values after using remove method:" +daysOfWeek);

        
        daysOfWeek= (HashSet) daysOfWeek.clone();
        System.out.println("values in HashSet clone object "+daysOfWeek);
        
        int size = daysOfWeek.size();

        System.out.println("Size of hash set is "+size);
        
      //Checking whether hashset is empty

        boolean flag = daysOfWeek.isEmpty();

        System.out.println("Is hash set empty ? "+flag);
        
        
        daysOfWeek.clear();
        System.out.println("values in HashSet object After using Clear method"+ daysOfWeek);
        
        boolean flag1 = daysOfWeek.isEmpty();

        System.out.println("Is hash set empty ? "+flag1);

     }
}


