import java.util.ArrayList;
import java.util.List;

import org.json.simple.JSONValue;

public class Json_List 
{

	public static void main(String[] args) 
	{
		 List arr = new ArrayList();  
		 arr.add("sonoo");    
		 arr.add(27);    
		 arr.add(600000);   
		 String jsonText = JSONValue.toJSONString(arr);  
		 System.out.print(jsonText);  

	}

}
