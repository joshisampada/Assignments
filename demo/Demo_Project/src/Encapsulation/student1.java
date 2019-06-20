package Encapsulation;

public class student1
{
	 private String stdName; 
     private int stdRollNo;
     private int stdId;
     
     public String getStdName()
     { 
         return stdName;
     }
     
     
     public int getStdRollNo()
     {
         return stdRollNo;
     }
     
     
     public int getStdId()
     {
         return stdId;
     }


     public void setStdName(String name)
     {
         stdName=name;
     }
     
     public void setStdRollNo(int rollNo)
     {
         stdRollNo=rollNo;
     }
     
     public void setId(int id)
     {
         stdId=id;
     }
  
	public static void main(String[] args) 
	{
		 student1 obj=new student1();
		 obj.setStdName("Kiran");
         obj.setStdRollNo(4);
         obj.setId(12345);
         System.out.println("Student's Name: " +obj.getStdName());
         System.out.println("Student's Roll no.: " +obj.getStdRollNo());
         System.out.println("Student's Id: " +obj.getStdId());


	}

}
