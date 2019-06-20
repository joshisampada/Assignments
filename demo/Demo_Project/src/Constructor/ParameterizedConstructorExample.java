package Constructor;

public class ParameterizedConstructorExample
{
    int id;
    String name;
    
   ParameterizedConstructorExample(int i,String n)
    {
      id = i;
      name = n;
    }
    
    public void display()
    {
    	System.out.println(id+" "+name);
    }
	
    public static void main(String[] args) 
	{
    	ParameterizedConstructorExample p1 = new ParameterizedConstructorExample(10,"Swati");
    	
    	p1.display();
    	
    	ParameterizedConstructorExample p2 = new ParameterizedConstructorExample(11,"Sonam");
    	
    	p2.display();

	}

}
