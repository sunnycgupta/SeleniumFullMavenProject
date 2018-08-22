package restAssured;
import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;
public class RestGivenWhen {

	public void myGive() {
		given().parameter("", "").when().get()
		.then().assertThat().body("", equalTo("225"));
		}
}
