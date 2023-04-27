package PostRequestDifferentWays;

import java.util.HashMap;

import org.testng.annotations.Test;

import GenericUtility.JavaUtility;
import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;

public class ByUsingHashMap {
	@Test
	 public void UsingHashMap()
	
{
		
		JavaUtility jlib = new JavaUtility();
		
		HashMap<String, Object> Hmap = new HashMap<String, Object>();
		Hmap.put("createdBy", "Suma");
		Hmap.put("projectName", "RestAPI"+jlib.getrandomnum());
	    Hmap.put("status", "Created");
	    Hmap.put("teamSize", 3);
	    
	   
//Precondition   
	    given()
		.contentType(ContentType.JSON)
	    .body(Hmap)

//Action	
	    .when()
		.post("http://localhost:8084/addProject")

		
		//Validation	
	   .then().log().all();
}
}
