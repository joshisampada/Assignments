package Constructor;

public class CopyingValWithoutConstructor
{
     int id ;
     String name;
     int age;
     
     CopyingValWithoutConstructor(int i,String n,int a)
     {
    	 id=i;
    	 name=n;
    	 age=a;
     }
     
     CopyingValWithoutConstructor()
     {
    	 
     }
     
     public void display()
     {
    	 System.out.println(id+ " " +name+ " " +age);
     }
	
     
     public static void main(String[] args)
	{
    	 CopyingValWithoutConstructor c1 = new CopyingValWithoutConstructor(1,"amu",20);
    	 CopyingValWithoutConstructor c2 = new CopyingValWithoutConstructor();
    	 c2.id=c1.id;
    	 c2.name=c1.name;
    	 c2.age=c1.age;
    	 c1.display();
    	 c2.display();

	}

}
