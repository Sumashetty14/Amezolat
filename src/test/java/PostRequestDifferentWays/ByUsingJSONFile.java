package PostRequestDifferentWays;

import java.io.File;

import org.testng.annotations.Test;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;

public class ByUsingJSONFile {
	@Test
	public void create_project_With_JsonObject()
	{
		
			File file = new File("./jsondata.json");
			
	//Precondition   
		    given()
			.contentType(ContentType.JSON)
		    .body(file)

	//Action	
		    .when()
			.post("http://localhost:8084/addProject")

			
			//Validation	
		   .then().log().all();
	}
	}


