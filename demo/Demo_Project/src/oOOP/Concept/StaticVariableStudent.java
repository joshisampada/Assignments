package oOOP.Concept;

public class StaticVariableStudent
{
	int id;
	String name;
	static String clgnm="BTS";
	
	StaticVariableStudent(int i,String n)
	{
		id=i;
		name=n;
	}
	
	void display()
	{
		System.out.println(id+ " " +name+ " "+clgnm);
	}
	
	
	public static void main(String[] args)
	{
		StaticVariableStudent.clgnm="JDCHAWARE";
		StaticVariableStudent s1=new StaticVariableStudent(101,"Sonal");
		s1.display();
		StaticVariableStudent s2=new StaticVariableStudent(102,"Soham");
		s2.display();
	}

}
