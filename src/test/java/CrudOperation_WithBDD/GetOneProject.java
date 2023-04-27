package CrudOperation_WithBDD;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;
import io.restassured.response.Response;

public class GetOneProject {
	@Test
	public void GetProject()
	{	//Action
		when()
		.get("http://localhost:8084/projects/TY_PROJ_681")
		//Validation
		.then().log().all();
		}

}
