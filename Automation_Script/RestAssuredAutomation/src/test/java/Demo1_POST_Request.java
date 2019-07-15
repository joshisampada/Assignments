import org.json.simple.JSONObject;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class Demo1_POST_Request 
{
	@Test
	void RegistrationSuccessful()
	{
		//Specify base URI
		RestAssured.baseURI = "https://jsonplaceholder.typicode.com";
		
		//Request object
		RequestSpecification httpRequest = RestAssured.given();
		
		
		JSONObject requestParams = new JSONObject();
		requestParams.put("userId","1");
		requestParams.put("id","55");
		requestParams.put("title","A Short Guide to a Happy Life");
		requestParams.put("body","The Book in Three Sentences: The only thing you have that nobody else has is control of your life. The hardest thing of all is to learn to love the journey, not the destination. Get a real life rather than frantically chasing the next level of success.");
		
		httpRequest.header("Content-Type", "application/json");
		
		
		//attach data to the request
		httpRequest.body(requestParams.toJSONString());
		
		
		
		//Response object
		//Response response =  httpRequest.request(Method.GET,"/employees");
		Response response = httpRequest.request(Method.POST,"/posts");
		
		//print response in console window
		String responseBody = response.getBody().asString();
		System.out.println("Response body is :" +responseBody);
		
		//status code validation
		int statusCode = response.getStatusCode();
		System.out.println("The status code is:" +statusCode);
		Assert.assertEquals(statusCode, 201);
		
		//status line verification
		String statusLine = response.getStatusLine();
		System.out.println(statusLine);
		Assert.assertEquals(statusLine, "HTTP/1.1 201 Created");
		
		

		
		
	}
}

