import java.io.File;
import java.io.FileReader;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

public class ReadJsonFile
{
	public static void main(String[] args)
	{
		ClassLoader cl = new ReadJsonFile().getClass().getClassLoader();
		String fileName = "C:\\\\Users\\\\Sampada.Joshi\\\\Desktop\\\\hello.json";
		File file =new File(cl.getResource(fileName).getFile());
		
		JSONParser parser = new JSONParser();
		
		try
		{
			FileReader reader = new FileReader(file.getAbsolutePath());
			Object obj = parser.parse(reader);
			JSONObject JsonObj = (JSONObject) obj;
			JSONObject ShowData = (JSONObject) JsonObj.get("ShowData");
			System.out.println("ShowData : " +ShowData.toJSONString() );
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}
