package restAPI;

import org.testng.annotations.Test;
import static io.restassured.RestAssured.given;


public class Bearertoken {
	@Test
		public void BasicAuth() {
			
		given().auth().basic("postman","password")
		.when().get("https://postman-echo.com/basic-auth")
		.then().statusCode(200).log().all();
	}
	@Test
	public void bearertoken1() {
		String Token="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";
		given().header("Authorization","Bearer "+Token)
		
		
		.when().get("https://api.github.com/user/repos")
		.then().statusCode(200).log().all();
	}
	
	}
