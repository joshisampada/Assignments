import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class Demo1_DELETE_Request
{
	@Test
	void DeletionSuccessful()
	{
	RequestSpecification request=RestAssured.given();
	Response response=request.delete("https://jsonplaceholder.typicode.com/posts/1");
	int statusCode = response.getStatusCode();
	System.out.println("The status code is:" +statusCode);
	Assert.assertEquals(statusCode, 200);


	
	//System.out.println("The status code is:" +statusCode);
	//Assert.assertEquals(statusCode, 200);
	}

}
