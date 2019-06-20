package oOOP.Concept;

public class StudentClassObjectMulObj 
{
	int id;  
	String name;  
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		StudentClassObjectMulObj  s1=new StudentClassObjectMulObj();  
		StudentClassObjectMulObj  s2=new StudentClassObjectMulObj();
		s1.id=101;  
	    s1.name="Sonoo";  
		s2.id=102;  
		s2.name="Amit";  
		  //Printing data  
		System.out.println(s1.id+" "+s1.name);  
		System.out.println(s2.id+" "+s2.name);  
	}

}
