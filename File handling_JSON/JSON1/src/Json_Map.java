import java.util.HashMap;
import java.util.Map;

import org.json.simple.JSONValue;

public class Json_Map 
{

	public static void main(String[] args) 
	{
		Map obj=new HashMap();    
		obj.put("name","sonoo");    
		obj.put("age",27);    
		obj.put("salary",600000);   
		String jsonText = JSONValue.toJSONString(obj);  
		System.out.print(jsonText);  

	}

}
