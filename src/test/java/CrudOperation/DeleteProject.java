package CrudOperation;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class DeleteProject {
	@Test
	public void Delete_project()
	{	//Action
		Response resp = RestAssured.delete("http://localhost:8084/projects/TY_PROJ_819");
		//Validation
		resp.then().log().all();
		}

}
