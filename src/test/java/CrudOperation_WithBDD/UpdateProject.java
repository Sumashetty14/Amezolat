package CrudOperation_WithBDD;

import static io.restassured.RestAssured.given;

import org.json.simple.JSONObject;

import io.restassured.http.ContentType;

public class UpdateProject {
	public void upadateProject()
	{
		
		JSONObject jsonobject = new JSONObject();
		jsonobject.put("createdBy", "strings");
		jsonobject.put("projectName", "shetty");
			
		
		//precondition
		 given()
		.contentType(ContentType.JSON)
		.body( jsonobject.toJSONString())
		//Action
		.when()
		.put("http://localhost:8084/projects/TY_PROJ_681")
		//Validation
		.then().log().all();

}
}