package interview;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;

public class getmethod {
@Test

	public void get() {
	given()
	.get("https://reqbin.com/echo")
	.then()
	.assertThat().statusCode(200)
	.log().all();
		
	}
	
}

