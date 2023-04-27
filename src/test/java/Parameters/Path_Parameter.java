package Parameters;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.port;

import org.junit.Test;

import static io.restassured.RestAssured.*;

public class Path_Parameter {
	@Test
	public void path()
	{
		//PreRequest
		baseURI= "http://localhost:8084";
		port= 8084;
	
		given()
		.pathParam("pid","TY_PROJ_1003")
		
		//Action
		.when()
		.get("/projects/{pid}")
		
		//Validation
		.then()
		.log().all();
	}

}
