package multiplepersons;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

import com.fasterxml.jackson.databind.ObjectMapper;

import parsingjson.Person;

public class ParsingMultiple {

	public static void main(String[] args) {
		byte[] jsonData = null;

		try {
			jsonData = Files
					.readAllBytes(Paths.get("C:\\Users\\bharg\\New_workspace\\parsingJSON\\MultiplePersons.json"));
		} catch (IOException e) {
			e.printStackTrace();
		}

		ObjectMapper mapper = new ObjectMapper();
		Person[] person = null; // person class array because the json data is having multiple persons in an
								// array;
		// if the root element of any json element is array, we have to convert jsondata
		// into pojo class array type
		try {
			person = mapper.readValue(jsonData, Person[].class);
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("Length of person array  is " + person.length);
		// System.out.println(person.);

		// check age of the person whose firstname is rahul
		for (int i = 0; i < person.length; i++) {
			if (person[i].getFirstName().equals("Rahul")) {

				System.out.println(person[i].getAge());
			}

			if (person[i].getAddress().getAbc().getPincode().equals("593343") ){
				System.out.println("pass");
			}
		
		}

	}
}
