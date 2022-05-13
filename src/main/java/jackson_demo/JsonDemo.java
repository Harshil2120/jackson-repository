package jackson_demo;

import java.io.File;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

public class JsonDemo {

	public static void main(String[] args) {
		
	// 	Serialization of java object to emp.json file
		ObjectMapper obmap=new ObjectMapper();
		Employee em=new Employee("John","New york",23,"SDE");
		
		try {
			obmap.writeValue(new File("target/emp.json"),em);
		} catch (Exception e) {
			e.printStackTrace();
		} 
		
		// Deserialization of json data to java object
		ObjectMapper obmap1=new ObjectMapper();
		String data="{\"name\":\"John\",\"city\":\"New york\",\"age\":23,\"designation\":\"SDE\"}";
		
		try {
			Employee em1=obmap1.readValue(data,Employee.class);
			System.out.println(em1.getName());
		} catch (Exception e) {
			e.printStackTrace();
		} 
		
		// Using jsonNode to access particular data from the json tree
		ObjectMapper obmap2=new ObjectMapper();
		String data1="{\"name\":\"John\",\"city\":\"New york\",\"age\":23,\"designation\":\"SDE\"}";
		
		try {
			JsonNode node=obmap2.readTree(data1);
			System.out.println(node.get("name").asText());
			System.out.println(node.get("city").asText());
		} catch (Exception e) {
			e.printStackTrace();
		} 

	}

}
