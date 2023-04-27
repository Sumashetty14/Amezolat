package Authentications;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.given;
import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

public class BearerToken {
	@Test
	public void bearertoken()
	{
		baseURI= "https://api.github.com";
		JSONObject jobj=new JSONObject();
		jobj.put("name", "RestAssured_1.0");
		
		given()
		.auth()
		.oauth2("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")
		.body(jobj)
		.contentType(ContentType.JSON)
		
		
		.when()
		.post("/user/repos")
		
		.then().assertThat().statusCode(202).log().all();
		
	}
	

}
