package practise_programs;

import java.util.Scanner;

public class NestedSwitchExample2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the branch");
		String branch=scan.next();
		System.out.println("Enter the college year");
		int collegeYear=scan.nextInt();
		 switch( collegeYear )  
	        {  
	            case 1:  
	                System.out.println("English, Maths, Science");  
	                break;  
	            case 2:  
	                switch( branch )   
	                {  
	                    case "C":  
	                        System.out.println("Operating System, Java, Data Structure");  
	                        break;  
	                    case "E":  
	                        System.out.println("Micro processors, Logic switching theory");  
	                        break;  
	                    case "M":  
	                        System.out.println("Drawing, Manufacturing Machines");  
	                        break;  
	                    default:
	                    	System.out.println("Choose among C,E or M only");
	                    	break;    
	                }  
	                break;  
	            case 3:  
	                switch( branch )   
	                {  
	                    case "C":  
	                        System.out.println("Computer Organization, MultiMedia");  
	                        break;  
	                    case "E":  
	                        System.out.println("Fundamentals of Logic Design, Microelectronics");  
	                        break;  
	                    case "M":  
	                        System.out.println("Internal Combustion Engines, Mechanical Vibration");  
	                        break;  
	                    default:
	                    	System.out.println("Choose among C,E or M only");
	                    	break;
	                }  
	                break;  
	            case 4:  
	                switch( branch )   
	                {  
	                case "C":  
	                        System.out.println("Data Communication and Networks, MultiMedia");  
	                        break;  
	                    case "E":  
	                        System.out.println("Embedded System, Image Processing");  
	                        break;  
	                    case "M":  
	                        System.out.println("Production Technology, Thermal Engineering");  
	                        break; 
	                    default:
	                    	System.out.println("Choose among C,E or M only");
	                    	break;    
	                }  
	               break;  
	            default:
                	System.out.println("The entered information is wrong");
                	break;
	   			 
	        }  
		
		

	}

}
