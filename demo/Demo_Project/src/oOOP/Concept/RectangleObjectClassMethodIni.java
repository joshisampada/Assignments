package oOOP.Concept;

public class RectangleObjectClassMethodIni 
{
	 int length;  
	 int width;  
	 
	 void insert(int l, int w)
	 {  
	  length=l;  
	  width=w;  
	 }  
	 
	 void calculateArea()
	 { 
		 System.out.println(length*width);
	 }  
	  

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RectangleObjectClassMethodIni r1=new RectangleObjectClassMethodIni();  
		RectangleObjectClassMethodIni r2=new RectangleObjectClassMethodIni();  
		  r1.insert(11,5);  
		  r2.insert(3,15);  
		  r1.calculateArea();  
		  r2.calculateArea();  

	}

}
