package CrudOperation;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class GetAllProjects {
	@Test
	public void GetAllProject()
	{	//Action
		Response resp = RestAssured.get("http://localhost:8084/projects");
		//Validation
		resp.then().log().all();
		}

}
