package oOOP.Concept;

public class StudentClassObjectMethodIni2
{
	 int id;  
	 String name;  
     float salary;  
	
     void insert(int i, String n, float s)
     {  
	      id=i;  
	      name=n;  
	      salary=s;  
     }  
	    void display()
	    {
	    	System.out.println(id+" "+name+" "+salary);
	    }  

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		StudentClassObjectMethodIni2 e1=new StudentClassObjectMethodIni2();  
		StudentClassObjectMethodIni2 e2=new StudentClassObjectMethodIni2();  
		StudentClassObjectMethodIni2 e3=new StudentClassObjectMethodIni2();  
		    e1.insert(101,"ajeet",45000);  
		    e2.insert(102,"irfan",25000);  
		    e3.insert(103,"nakul",55000);  
		    e1.display();  
		    e2.display();  
		    e3.display();  
	}

}
