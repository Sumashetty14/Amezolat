package Validation;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.port;
import java.util.List;
import org.junit.Assert;
import org.junit.Test;

import io.restassured.response.Response;
import static io.restassured.RestAssured.*;

public class Dynamic_Validation {
	@Test
	public void staticResponse()
	{
		//Precondition
		String expectData = "TY_PROJ_1006";

		baseURI= "http://localhost:8084";
		port= 8084;
		
		//Action
		Response resp = when().get("/projects");
		
		//Validation
		boolean flag = false;
		List<String> allID = resp.jsonPath().get("projectId");
		for(String allProjectID : allID)
		{
			if(allProjectID.equalsIgnoreCase(expectData))
			{
				flag = true;
			}
		}
		
		Assert.assertTrue(flag);
		System.out.println("data validated");
		
		resp.then().log().all();
	
	
	}
}
