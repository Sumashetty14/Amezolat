package Parameters;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.given;
import static io.restassured.RestAssured.port;

import org.junit.Test;

public class Query_Parameter {
	@Test
	public void path()
	{
		//PreRequest
		baseURI= "http://reqres.in";
		port= 8084;
	
		given()
		.queryParam("page",2)
		
		//Action
		.when()
		.get("/api/users")
		
		//Validation
		.then()
		.log().all();
	}
}
