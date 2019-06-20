package oOOP.Concept;

public class StaticMethodCalculator
{
	
    static int cube(int x)
    {
    	return x*x*x;
    }
	public static void main(String[] args)
	{
		int result=StaticMethodCalculator.cube(5);
		System.out.println(result);
		
	}

}
