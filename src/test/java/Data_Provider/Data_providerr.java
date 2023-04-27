package Data_Provider;
import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.given;
import static io.restassured.RestAssured.port;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import GenericUtility.JavaUtility;
import io.restassured.http.ContentType;

public class Data_providerr {
	@Test(dataProvider = "getData")
	public void data(String createdBy, String projectName, String status, int teamSize)
	{
		
//pre-condition
		JavaUtility jlib = new JavaUtility();
	Pojo_Class.Create_project_POJO_class pojo= new Pojo_Class.Create_project_POJO_class(createdBy, projectName+jlib.getrandomnum(), status, teamSize);
		
		baseURI= "http://localhost:8084";
		port= 8084;
		
		//pre_conndition
		given()
		.contentType(ContentType.JSON)
		.body(pojo)
	   
		//Action
		.when()
		 .post("/addProject")
		 
		//Validation
		.then().log().all();
		
		
	}
	
	
	@DataProvider(name = "getData")
	public Object[][] data()
	{
		Object[][] data = new Object[3][4];
		
		data[0][0] = "Suma";
		data[0][1] = "API";
		data[0][2] = "xyz";
		data[0][3] = 3;
		
		data[1][0] = "Moksha";
		data[1][1] = "API";
		data[1][2] = "pqr";
		data[1][3] = 3;
		
		data[2][0] = "Ramya";
		data[2][1] = "Appium";
		data[2][2] = "lkm";
		data[2][3] = 3;
		
		
		return data; 
	}
}