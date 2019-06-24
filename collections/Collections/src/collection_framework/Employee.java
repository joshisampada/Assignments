package collection_framework;

public class Employee
{
	String empName;
	int empId;
	double empSalary;
	String empDesignation;
	int count = 1;
	
	Employee(String empName,int empId,double empSalary,String empDesignation)
	{
		this.empName = empName;
		this.empId = empId;
		this.empSalary = empSalary;
		this.empDesignation = empDesignation;
	}
	
	//Overridden method to return the states of the Employee class  
	public String toString()
	{
		return this.empName+"  "+this.empId+"  "+this.empSalary+"  "+this.empDesignation;
	}
}
