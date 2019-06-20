package Constructor;

public class CopyConstructorExample 
{
   int id;
   String name;
   
   CopyConstructorExample(int i,String n)
   {
	   id=i;
	   name=n;
   }
   
   CopyConstructorExample(CopyConstructorExample c)
   {
	   id=c.id;
	   name=c.name;
	   
   }
   
   public void display()
   {
	   System.out.println(id+ " " +name);
   }
   
	public static void main(String[] args)
	{
		CopyConstructorExample c1=new CopyConstructorExample(11,"hema");
		c1.display();
		CopyConstructorExample c2=new CopyConstructorExample(c1);
		c2.display();	
	}

}
