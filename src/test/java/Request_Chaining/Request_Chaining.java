package Request_Chaining;

import static io.restassured.RestAssured.*;

import GenericUtility.JavaUtility;
import Pojo_Class.Create_project_POJO_class;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class Request_Chaining {
	public void create_project_With_pojoclass()
	{
		//Create project with pojo class (recommended)	
		
		JavaUtility jlib= new JavaUtility();
		Create_project_POJO_class pojo= new Create_project_POJO_class("Suma", "API"+jlib.getrandomnum(), "Created", 3);
		baseURI= "http://localhost:8084";
		port= 8084;
		
		//Precondition   
	     Response resp = given()
		.contentType(ContentType.JSON)
	    .body(pojo)
	    
	    //Action	
	    .when()
		.post("/addProject");

	     //capture project id 
	     	String proID = resp.jsonPath().get("projectId");
	     	System.out.println(proID);
		resp.then().log().all();
	
			//Create a get request and pass proid as path parameter
		given()
		.pathParam("pid", proID)
		.when()
		.get("/projects/{pid}")
		.then()
		.assertThat().statusCode(200).log().all();
	
	}
	
}


