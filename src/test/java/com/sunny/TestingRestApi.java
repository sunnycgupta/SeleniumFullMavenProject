package com.sunny;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

import org.json.simple.JSONObject;

import static io.restassured.matcher.RestAssuredMatchers.*;

public class TestingRestApi {
	
	@Test
	public void checkCallFromRest() {
	
		RequestSpecification request=RestAssured.given();
		request.header("content-type","application/json");
		
		JSONObject json=new JSONObject();
		json.put("id", "body");
		request.body(json.toJSONString());
		Response response=request.put("");
		response.getStatusCode();
		
		given().get("").then().assertThat().statusCode(200);
	}
}
