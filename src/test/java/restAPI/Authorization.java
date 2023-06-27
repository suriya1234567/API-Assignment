package restAPI;
import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

import org.testng.annotations.Test;

public class Authorization {
	@Test
	public void basicauth() {
		given().auth().basic("postman","password")
		
		.when().get("https://postman-echo.com/basic-auth")
		
		.then().statusCode(200).log().all();
		
	}
	@Test
	public void digestauth() {
		given().auth().digest("admin", "admin")
		
		.when().get("https://id.heroku.com/login")
		
		.then().statusCode(200).log().all();
	}
	@Test
	public void bearer1() {
		
		String Token1="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";
		
		given().header("Authorization","Bearer "+Token1)
		
		.when().get("https://api.github.com/user/repos")
		
		.then().statusCode(200).log().all();
	}
	
}
