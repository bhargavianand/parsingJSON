package parsingjson;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

import com.fasterxml.jackson.databind.ObjectMapper;

/**
 * 
 * In this program we are converting json into a POJO class object(Person Class object)
 * using the class ObjectMapper from jackson databind.
 * @author bharg
 *
 */
public class Test {
	
	public static void main(String[] args) throws IOException {
		
		//byte[] jsonData = Files.readAllBytes(Paths.get("C:\\Users\\bharg\\New_workspace\\parsingJSON\\jsonexample.json"));
		
		byte[] jsonData_bytes = Files.readAllBytes(Paths.get("C:\\\\Users\\\\bharg\\\\New_workspace\\\\parsingJSON\\\\jsonexample.json"));
		
		ObjectMapper mapper = new ObjectMapper();
		
		Person person = mapper.readValue(jsonData_bytes,Person.class);
		
		System.out.println(person.getEmail());
		System.out.println(person.getFirstName());
		System.out.println(person.getLastName());
		System.out.println(person.getAge());
		
		System.out.println(person.getAddress().getCountry());
		System.out.println(person.getAddress().getAbc().getDistrict());

		
	}

}
