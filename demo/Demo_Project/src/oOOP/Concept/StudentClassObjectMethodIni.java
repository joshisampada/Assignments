package oOOP.Concept;

public class StudentClassObjectMethodIni 
{
	int rollno;  
	String name;  
	void insertRecord(int r, String n)
	{  
	 rollno=r;  
	 name=n;  
	 }  
	 
	void displayInformation()
	 {
		 System.out.println(rollno+" "+name);
	 }  
	  

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StudentClassObjectMethodIni s1=new StudentClassObjectMethodIni();  
		StudentClassObjectMethodIni s2=new StudentClassObjectMethodIni();  
		  s1.insertRecord(111,"Karan");  
		  s2.insertRecord(222,"Aryan");  
		  s1.displayInformation();  
		  s2.displayInformation();  

	}

}
