package org.practice;

import java.util.LinkedHashMap;
import java.util.Map;
import static io.restassured.RestAssured.given;

public class putRequest {
	public static void main(String[] args) {
		Map<String, String> m3 = new LinkedHashMap<String, String>();
		m3.put("id","4");
		m3.put("first_name", "touf");
		m3.put("last_name", "beyfang");
		m3.put("email", "touf@gmail.com");
		m3.put("location", "republic city");
		
		given().contentType("application/json").body(m3).
		when().put("http://localhost:3000/users/4").
		then().statusCode(200);
		
	}

}
