package CrudOperation;

import org.json.simple.JSONObject;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class UpdateProject {
	public void upadateProject()
	{
		
		JSONObject jsonobject = new JSONObject();
		jsonobject.put("createdBy", "strings");
		jsonobject.put("projectName", "shetty");
			
		
		//action 
		 RequestSpecification req = RestAssured.given();
		req.contentType(ContentType.JSON);
		req.body( jsonobject.toJSONString());
		req.put("http://localhost:8084/projects/TY_PROJ_681");
		req.then().log().all();

}
}