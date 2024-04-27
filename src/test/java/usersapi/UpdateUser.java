package usersapi;

import java.io.File;

import org.testng.annotations.Test;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

import static io.restassured.RestAssured.*;
public class UpdateUser extends SetUp {


	@Test
	public void updateUserInfo() {
	String endPoint = "users/1";
	File f = new File("C:\\Users\\bharg\\New_workspace\\parsingJSON\\src\\test\\resources\\PayloadJsonFiles\\UpdateUserInfo.json");
    
	Response response = given().contentType(ContentType.JSON).body(f)
	.put(endPoint);
	
	response.prettyPrint();
	}

}
