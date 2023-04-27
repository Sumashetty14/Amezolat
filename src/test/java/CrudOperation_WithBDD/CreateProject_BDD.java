package CrudOperation_WithBDD;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import GenericUtility.JavaUtility;

import static io.restassured.RestAssured.*;
import io.restassured.http.ContentType;

public class CreateProject_BDD {
	@Test
	public void createproject()
	{	JavaUtility jlty = new JavaUtility();
		JSONObject obj = new JSONObject();
		obj.put("createdBy", "rmg11");
		obj.put("projectName","tyyco11"+jlty.getrandomnum());
		obj.put("status", "Compleat");
		obj.put("teamSize",10);
		//Precondition
		given()
		.contentType(ContentType.JSON)
		.body(obj.toJSONString())
		//Action
		.when()
		 .post("http://localhost:8084/addProject")
		//Validation
		
		.then().log().all()
		.assertThat().statusCode(200)
		.assertThat().contentType(ContentType.JSON);
		
		
		
		
		

  }

}
