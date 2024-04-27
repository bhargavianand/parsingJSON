package hashMapParsing;




import java.util.ArrayList;
import java.util.HashMap;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

import static io.restassured.RestAssured.*;

public class Example1 extends SetUp{
	

	@Test
	public void sendPostRequestUsingHashMap() {
		HashMap<String,String> map = new HashMap<String,String>();
		map.put("name", "Bhargavi");
		map.put("job", "Trainer");
		/*
		 * map.put("designation", "leader");
		 * 
		 * ArrayList<String> list1 = new ArrayList<String>(); list1.add("java");
		 * list1.add("Selenium"); list1.add("API"); System.out.println(list1);
		 * 
		 * map.put("Technology", list1.toString());
		 */	
		Response response = given().contentType(ContentType.JSON).body(map).log().all().post("users");

		response.prettyPrint();
	
	     System.out.println("statuscode is : " +response.statusCode());
	}
	
//	@Test
	public void deleteCustomer() {
		Response response = given().contentType(ContentType.JSON).log().all().delete("users/2");
		response.prettyPrint();

	     System.out.println("statuscode is : " +response.statusCode());

	}
	
	

	
}
