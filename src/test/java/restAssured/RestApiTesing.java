package restAssured;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class RestApiTesing {
	@Test
	public void checkStatusCode() {
		
		Response resp=RestAssured.get("https://samples.openweathermap.org/data/2.5/weather?q=London,uk&appid=b6907d289e10d714a6e88b30761fae22");
		System.out.println(resp.getBody().asString());
		int code= resp.getStatusCode();
		System.out.println("Code is "+code);
		Assert.assertEquals(code, 400);
		
	}

	@Test
	public void checkResponseContent() {
		
		Response resp=RestAssured.get("https://samples.openweathermap.org/data/2.5/weather?q=London,uk&appid=b6907d289e10d714a6e88b30761fae22");
		String data= resp.asString();
		System.out.println("Data is "+data);

		Assert.assertTrue(data.contains("light intensity drizzle"));
	}
}
