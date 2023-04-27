package CrudOperation_WithBDD;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;

public class GetAllProjects_BDD {
	@Test
	public void GetAllProject()
	{	//Action
		when()
		.get("http://localhost:8084/projects")
		//Validation
		.then().log().all();
		}

}
