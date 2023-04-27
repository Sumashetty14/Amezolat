package PostRequestDifferentWays;

import Pojo_Class.Create_project_POJO_class;
import static io.restassured.RestAssured.*;
import io.restassured.http.ContentType;

public class ByUsingPojoClass {
	{
		Create_project_POJO_class pojo= new Create_project_POJO_class("Suma", "POJO", "Created", 3);
		
		baseURI= "http://localhost:8084";
		port= 8084;
		//Precondition   
	    given()
		.contentType(ContentType.JSON)
	    .body(pojo)

	//Action	
	    .when()
		.post("/addProject")

		
		//Validation	
	   .then().log().all();
	}

}
