import java.io.FileWriter;
import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

public class CreateJsonFile 
{

	public static void main(String[] args) 
	{
		JSONObject obj = new JSONObject();
		obj.put("name", "Sampada");
		obj.put("age", 25);
		obj.put("Location", "Nashik");
		
		JSONArray list = new JSONArray();
		list.add("Java");
		list.add("C++");
		list.add("C");
		
		obj.put("courses", list);
		
		try(FileWriter file = new FileWriter("JSON.json"))
		{
			file.write(obj.toString());
			file.flush();
		}
		
		catch(IOException e)
		{
			e.printStackTrace();
		}
		
		System.out.println(obj);

	}

}
