package CrudOperation;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class GetOneProject {
	@Test
	public void GetProject()
	{	//Action
		Response resp = RestAssured.get("http://localhost:8084/projects/TY_PROJ_681");
		//Validation
		resp.then().log().all();
		}

}
