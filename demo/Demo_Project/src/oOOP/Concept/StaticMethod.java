package oOOP.Concept;

public class StaticMethod
{
    int id;
    String name;
    static String college="IIT";
    
    static void change()
    {
    	college="BBTSS";
    }
    
    StaticMethod(int i,String n)
    {
    	id=i;
    	name=n;
    }
    
    void display()
    {
    	System.out.println(id+ " " +name+ " " +college);
    }
    
	public static void main(String[] args)
	{
		
		StaticMethod m1=new StaticMethod(1001,"ram");
		m1.display();
		StaticMethod.change();
		StaticMethod m2=new StaticMethod(2002,"raj");
		m2.display();

	}

}
