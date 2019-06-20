package oOOP.Concept;

public class MultipleObject 
{
  		int length;  
	    int width;  
	    
	    void insert(int l,int w)
	     {  
	       length=l;  
		   width=w;  
		 }  
		
	    void calculateArea()
	    {
	    	System.out.println(length*width);
	    }  
	    
		  
	public static void main(String[] args)
	{
		 MultipleObject  r1=new MultipleObject (),r2=new MultipleObject();//creating two objects  
		 r1.insert(200,5);  
		 r2.insert(9,15);  
	     r1.calculateArea();  
	     r2.calculateArea();
		
		
	}

}
