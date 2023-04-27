package CrudOperation;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import GenericUtility.JavaUtility;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class CreateProject {
	
		@Test
		public void CreateProject()
		{
				JavaUtility jlib = new JavaUtility();
				JSONObject jsonobj = new JSONObject();
				jsonobj.put("createdBy", "Suma");
				jsonobj.put("projectName", "APIsss");
			    jsonobj.put("status", "Createdd");
			    jsonobj.put("teamSize", 5);
		//Precondition    
				RequestSpecification req = RestAssured.given();
				req.contentType(ContentType.JSON);
				req.body(jsonobj.toJSONString());

		//Action		
				Response resp = RestAssured.post("http://localhost:8084/addProject");

		/*Print		
				resp.then().log().all();*/
				
		//Validation 
				System.out.println(resp.contentType());
				System.out.println(resp.statusCode());
		}
		}
			



