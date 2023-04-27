package CrudOperation_WithBDD;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;

public class DeleteProject_BDD {
	@Test
	public void Delete_project()
	{	
		
		//Action
		when()
		.delete("http://localhost:8084/projects/TY_PROJ_819")
	
		//Validation
		.then().log().all();
		}

}
