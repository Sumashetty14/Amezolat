package PostRequestDifferentWays;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import GenericUtility.JavaUtility;
import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;

public class ByUsingJsonObject {
	@Test
	public void UsingJsonObject()
	{
		
				JavaUtility jlib = new JavaUtility();
				JSONObject jsonobj = new JSONObject();
				jsonobj.put("createdBy", "Suma");
				jsonobj.put("projectName", "API"+jlib.getrandomnum());
			    jsonobj.put("status", "Created");
			    jsonobj.put("teamSize", 5);
			    
			    
		//Precondition   
			    given()
				.contentType(ContentType.JSON)
			    .body(jsonobj.toJSONString())

		//Action	
			    .when()
				.post("http://localhost:8084//addProject")

				
				//Validation	
			   .then().log().all();
		}
	}
	
	
	


