package GenericUtility;

import io.restassured.response.Response;

public class RestAssured_utility {
/**
 * It consist methods of rest assured tool 
 * @author Suma
 */
	
	public String getJsonData(Response response , String path) 
	{
		 String jsonData = response.jsonPath().get(path);
		return jsonData;
	}
}