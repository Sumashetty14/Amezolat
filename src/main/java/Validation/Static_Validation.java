package Validation;

import org.junit.Assert;
import org.junit.Test;

import io.restassured.response.Response;
import static io.restassured.RestAssured.*;

public class Static_Validation {
	@Test
	public void StaticValidation()
	{
		//Precondition
		String expData="TY_PROJ_1003";
		baseURI="http://localhost:8084";
		port=8084;
		
		//Action
		Response resp = when()
				.get("/projects");
		
		//Validation
		String actData = resp.jsonPath().get("[3].projectId");
		Assert.assertEquals(actData, expData);
		System.out.println("Data Varified is done");
		
		resp.then().log().all();
		
		
	}

}
