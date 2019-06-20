package oOOP.Concept;

public class StudentClassObjectExample
{
	int id;
	String name;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		StudentClassObjectExample s1=new StudentClassObjectExample();
		System.out.println(s1.id);
		System.out.println(s1.name);
		
		StudentCoOutsideMain s2 = new StudentCoOutsideMain();
		System.out.println(s2.id1);
		System.out.println(s2.name1);

	}

}
