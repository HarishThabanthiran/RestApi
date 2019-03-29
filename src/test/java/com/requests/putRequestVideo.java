package com.requests;

import java.util.LinkedHashMap;
import java.util.Map;
import static io.restassured.RestAssured.given;

public class putRequestVideo {
	
	public static void main(String[] args) {
		Map<String, String> m = new LinkedHashMap<String, String>();
		m.put("id", "22");
		m.put("first_name", "roku");
		m.put("last_name", "azulan");
		m.put("email", "roku@gmail.com");
		m.put("location", "roku temple");		
		given().contentType("application/json").body(m).
		when().put("http://localhost:3000/users/22").
		then().statusCode(200);
	}

}
